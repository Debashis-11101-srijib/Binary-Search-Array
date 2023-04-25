import java.util.*;

public class continuesstatement {
    public static void main(String[] args) {
        // for (int i = 1; i <= 10; i++) {
        // if (i == 7) {
        // continue;
        // }
        // System.out.println(i);
        // }
        // }

        // Display all number entered by user expect multiple by 10:-------

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int X = sc.nextInt();
        for (int i = 1; i <= X; i++) {
            if (i % 10 == 0) {
                continue;
            }
            System.out.println(i);
        }

        // or;;;;;;;

        // do {

        // System.out.println("Enter the number:");
        // int X = sc.nextInt();
        // if (X % 10 == 0) {
        // continue;
        // }
        // System.out.println("number was:" + X);
        // } while (true);

    }
}
