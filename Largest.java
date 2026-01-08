public class Largest {
    public static int largestEl(int[] a) {
    int largest = a[0];

    for (int i = 1; i < a.length; i++) {
        if (a[i] > largest) {
            largest = a[i];
        }
    }
    return largest;
}
    public static void main(String[] args) {
        int[] arr={3, 7, 2, 9, 4};
        System.out.println(largestEl(arr));
    }
}
