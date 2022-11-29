import java.util.Scanner;

public class Assign4B {
    public static void main(String[] args) {
        int n, a = 0, b = 1, x = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        n = sc.nextInt();

        // System.out.print(a + " " + b + " ");
        for (int i = 0; i < n; i++) {
            System.out.print(x + " ");
            a = b;
            b = x;
            x = a + b;

        }
        sc.close();
    }
}
