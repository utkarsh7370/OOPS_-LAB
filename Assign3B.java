import java.util.*;
import java.lang.Math;

public class Assign3B {
    public static void main(String[] args) {
        int a, b, c;
        double d, root1, root2;
        System.out.print("Enter the value of a, b, c: ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        d = b * b - 4 * a * c;

        System.out.println("The equation is: " + a + "X^2 + " + b + "X + " + c + " = 0");
        if (d >= 0) {

            root1 = (-b + Math.sqrt(d)) / (2 * a);
            root2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("First Root: " + root1 + " Second Root: " + root2);
        } else {
            System.out.println("Root of this equation is not real.");

        }

        sc.close();
    }
}
