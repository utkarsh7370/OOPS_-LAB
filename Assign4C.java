import java.util.Scanner;

public class Assign4C {
    public static void main(String[] args) {
        int l, r, flag;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter limits: ");
        l = sc.nextInt();
        r = sc.nextInt();
        for (int i = l; i <= r; i++) {
            flag = 0;
            for (int j = 2; j <= (i / 2); j++) {
                if (i % j == 0) {
                    flag = 1;
                }
            }

            // System.out.print(i + " ");
            if (flag == 0) {
                System.out.print(i + "  ");
            }
        }
        sc.close();

    }

}
