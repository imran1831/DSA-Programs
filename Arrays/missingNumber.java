public class missingNumber {
    public static int missing(int[] nums) {
        int mis=nums.length;
        for(int i=0;i<nums.length;i++){
            mis^=i^nums[i];
        }
        return mis;
    }
    public static void main(String[] args) {
        int[] nums={3,0,1};
        System.out.println(missing(nums));
    }
}
