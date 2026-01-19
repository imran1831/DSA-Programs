// --------Finding Maximum-----
public class MaxSubArray {
    public static double maxSum(int[] arr,int k){
        if(arr.length<k) return -1;
        int windowSum=0;
        for(int i=0;i<k;i++){
            windowSum+=arr[i];
        }
        int maxSum=windowSum;
        for(int i=k;i<arr.length;i++){
            windowSum=windowSum-arr[i-k]+arr[i];
            maxSum=Math.max(maxSum,windowSum);
        }
        return (double) maxSum/k;
    }
    public static void main(String[] args) {
        int[] arr={1,12,-5,-6,50,3};
        int k=4;
        System.out.print(maxSum(arr,k));
    }
}
