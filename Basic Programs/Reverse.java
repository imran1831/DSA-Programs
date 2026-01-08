public class Reverse {
    public static int revFun(int n){
        int rev=0;
        while(n>0){
            rev=rev*10+n%10;
            n/=10;
        }
        return rev;
    }
    public static void main(String[] args) {
        int n=546;
        System.err.println(revFun(n));
    }

}
