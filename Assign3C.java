import java.util.*;

public class Assign3C {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Year: ");
        a = sc.nextInt();
        if (a % 4 == 0 || a % 400 == 0) {
            System.out.print(a + " is the leap year.");
        } else {

            System.out.print(a + " is not the leap year.");
        }
        sc.close();
    }
}
