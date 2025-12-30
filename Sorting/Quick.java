import java.util.Arrays;
public class Quick {
    public static  int partition(int[] arr,int low,int high){
        int pivot=arr[low];
        int i=low;
        int j=high;
        while(i<j){
            while(arr[i]<=pivot && i<=high-1){
                i++;
            }
            while(arr[j]>pivot && j>low+1){
                j--;
            }
            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;
        return j;
    }
    public static int[] quickSort(int[] arr,int low,int high){
        if(low<high){
            int pi=partition(arr,low,high);
            quickSort(arr, low, pi-1);
            quickSort(arr, pi+1, high);
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr={7, 4, 1, 5, 3};
        int low=0;
        int high=arr.length-1;
        // int[] qs=Quick.quickSort(arr,low,high);
        System.out.println(Arrays.toString(quickSort(arr, low, high)));
    }
}
