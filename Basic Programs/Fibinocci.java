import java.util.Scanner;

public class Fibinocci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int b = 1;
        int c;
        int n = sc.nextInt();
        System.out.print(a + " " + b + " ");
        for (int i = 0; i < n - 2; i++) {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
        sc.close();
    }
}
