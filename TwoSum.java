import java.util.Arrays;

class TwoSum{
    public static int[] TSP(int[] arr,int target){
        for(int i=0;i<arr.length;i++){
        for(int j=1;j<arr.length;j++){
            if(arr[i]+arr[j]==target){
                return new int[]{arr[i],arr[j]};
            }
        }
    }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int arr[]={2,3,3,5,3,4,1};
        int target=9;
        System.out.println(Arrays.toString(TSP(arr,target)));
    }
}