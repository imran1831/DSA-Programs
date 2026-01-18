import java.util.Arrays;
public class Bubble {
    static int[] bubbleSort(int[] nums){
        int n=nums.length;
        for(int i=n-1;i>=1;i--){
            for(int j=0;j<i;j++){
                if(nums[j]>nums[j+1]){
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }
        return nums;
    }
    public static void main(String[] args) {
        int[] nums={4,6,7,1,3,2};
        System.out.println(Arrays.toString(bubbleSort(nums)));
    }
}
