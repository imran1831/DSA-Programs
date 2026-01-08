// import java.util.*;
public class ArmStrong {
    public static boolean is_Armstrong(int n){
        int original=n;
        int sum=0;
        int no_Digit=String.valueOf(n).length();
        while(n>0){
            int d=n%10;
            sum+=Math.pow(d,no_Digit);
            n/=10;
        }
        return sum==original;
    }
    public static void main(String[] args) {
        int n=153;
        System.out.println(is_Armstrong(n));
    }
}
