public class secondLargestArray {
    public static int sle(int[] nums){
        if(nums.length<2) return -1;
        int FL=Integer.MIN_VALUE;
        int SL=Integer.MIN_VALUE;
        for(int num:nums){
            if(num>FL){
                SL=FL;
                FL=num;
            }
            else if(num>SL && num!=FL){
                SL=num;
            }
        }
        return SL==Integer.MIN_VALUE? -1 : SL;
    }
    public static void main(String[] args) {
        int[] arr={5, 9, 2, 11, 7, 9};
        System.out.println(sle(arr));
    }
}
