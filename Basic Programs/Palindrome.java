class Palindrome{
    public static boolean  is_Palindrome(int n){
        int original=n;
        int rev=0;
        while(n>0){
            rev=rev*10 + n%10;
            n=n/10;
        }
        return rev==original;
    }
    public static void main(String[] args) {
        int n=243;
        System.out.println(is_Palindrome(n));
    }
}