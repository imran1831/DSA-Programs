import java.util.Arrays;

public class Solution {
    public static  int[] selectionSort(int[] nums) {
        for(int i=0;i<nums.length-1;i++){
            int min=i;
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]<nums[min]){
                    min=j;
                }
            }
            int temp=nums[min];
                nums[min]=nums[i];
                nums[i]=temp;
        }
        return nums;
    }
    public static void main(String[] args) {
        int[] nums={3,2,5,8,6,1};
        int[] sorted=selectionSort(nums);
        System.err.println(Arrays.toString(sorted));
    }
}
