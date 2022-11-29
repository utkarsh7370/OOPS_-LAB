import java.util.Scanner;

public class Assign4D {
    public static void main(String[] args) {
        int n, temp, sum = 0, r;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        n = sc.nextInt();
        temp = n;
        while (n > 0) {
            r = n % 10;
            sum = (sum * 10) + r;
            n = n / 10;
        }

        if (temp == sum) {
            System.out.print(temp + " is plaindrome number.");
        } else {
            System.out.print(temp + " is not plaindrome number.");

        }

        sc.close();
    }

}
