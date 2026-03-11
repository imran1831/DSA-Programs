
public class RangeCount {
    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 3, 5};
        int n = arr.length;
        int[] prefix = new int[n];
        prefix[0] = arr[0];
        for(int i = 1; i < n; i++){
            prefix[i] = prefix[i - 1] + arr[i];
        }
        int L = 1;
        int R = 3;
        int sum = prefix[R] - (L > 0 ? prefix[L - 1] : 0);
        System.out.println(sum);
    }
}