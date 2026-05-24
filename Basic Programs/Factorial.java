public class Factorial {
    public static int Fact(int n){
        if(n==0||n==1){
            return 1;
    }
    // Iterative approach
    // int result=1;
    // for(int i=1;i<=n;i++){
    //     result*=i;
    // }
    // return result;

    // Recursive approach
    return n*Fact(n-1);
}
    public static void main(String[] args) {
        int n=5;
        System.out.println(Fact(n));
    }
}
