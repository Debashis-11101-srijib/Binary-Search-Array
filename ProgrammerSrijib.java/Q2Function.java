import java.util.*;

public class Q2Function {

    public static boolean isEven(int n) {
        if (n % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number");

        int n = sc.nextInt();
        if (isEven(n)) {
            System.out.println("Number is Even");
        } else {
            System.out.println("Number is odd");
        }

    }

}
