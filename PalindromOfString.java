public class PalindromOfString {
    public static void main(String[] args) {
        String s="madan";
        int l=0;
        int r=s.length()-1;
        while(l<r){
            if(s.charAt(l)!=s.charAt(r)){
                System.out.println(s + " is not a Palindrome");
                return;
            }
            else{
                l++;
                r--;
            }
        }
        System.out.println(s + " is a Palindrome");
    }
}
