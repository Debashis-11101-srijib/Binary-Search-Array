import java.util.*;

public class CharcterParttern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = 'A';
        int n;
        System.out.println("Enter The Number:");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int al = 1; al <= i; al++) {
                System.out.print(ch);
                ch++;

            }
            System.out.println();
        }
    }

}
