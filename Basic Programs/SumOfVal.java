public class SumOfVal {
    public static  int sumVal(int n){
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        int n=123;
        System.out.println(sumVal(n));
    }
}
