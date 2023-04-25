import java.util.*;

public class invertStar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.println("Enter The Number: ");
        n = sc.nextInt();

        for (int line = 1; line <= n; line++) {
            for (int star = 1; star <= n - line + 1; star++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

}
