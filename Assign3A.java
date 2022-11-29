// Write a java program to identify largest among three numbers using Conditional Operator.

import java.util.*;

public class Assign3A {
    public static void main(String[] args) {

        int a, b, c;
        System.out.print("Enter the three numbers: ");

        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        if (a > b) {
            if (a > c) {
                System.out.println(a + " is the Largest number.");
            } else {
                System.out.println(c + " is the Largest number.");

            }
        } else {
            if (b > c) {
                System.out.println(b + " is the Largest number.");

            } else {
                System.out.println(c + " is the Largest number.");

            }
        }
        sc.close();
    }
}