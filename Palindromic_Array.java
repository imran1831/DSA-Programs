class Palindromic_Array{
    public static boolean  isPalindrome(int a[]) {
        int left=0;
        int right=a.length-1;
        while(left<right){
            if(a[left]!=a[right]){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,5,1};
        System.out.println(isPalindrome(arr));
    }
}