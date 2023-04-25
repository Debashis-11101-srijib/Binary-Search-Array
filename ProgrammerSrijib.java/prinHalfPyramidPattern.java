import java.util.*;

public class prinHalfPyramidPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter The Number:");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int num = 1; num <= i; num++) {
                System.out.print(num);
            }
            System.out.println();
        }

    }

}
