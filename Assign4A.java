import java.util.Scanner;

public class Assign4A {
    public static void main(String[] args) {
        int n, x, tempx, tempn;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N and X: ");
        n = sc.nextInt();
        x = sc.nextInt();
        tempx = x;
        tempn = n;
        while (n > 1) {
            x = x * tempx;
            n--;
        }
        System.out.print(tempx + "^" + tempn + " = " + x);

        sc.close();
    }
}
