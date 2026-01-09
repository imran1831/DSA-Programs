import java.util.*;
class Rotating_Array{
    public static int[] rotate_by_k(int[] a,int k){
        int left=0;
        int right=a.length-1;
        while(left<right){
            int temp=a[left];
            a[left]=a[right];
            a[right]=temp;
        }
        return a;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int k=2;
        System.out.println(Arrays.toString(rotate_by_k(arr,k)));
    }
}