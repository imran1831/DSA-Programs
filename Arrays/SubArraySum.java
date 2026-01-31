class SubArraySum{
    public static void main(String[] args) {
        int[] nums={1,2,3};
        int k=3;
        int count=0;
        int left=0;
        int sum=0;
        for(int right=0;right<nums.length;right++){
            sum+=nums[right]-nums[left]+1;
            if(sum==k){
                count++;
                left++;
            }
        }
        System.out.println(count);
    }
}