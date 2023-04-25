import java.util.*;

public class Q3Function {

    public static boolean isReverse(int n) {
        int my = n;
        int Rev = 0;
        while (my > 0) {
            int LastDigit = my % 10;
            Rev = (Rev * 10) + LastDigit;
            my = my / 10;
        }
        if (n == Rev) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int my = sc.nextInt();

        if (isReverse(my)) {
            System.out.println("Number " + my + " is Palindrome.");
        } else {
            System.out.println("Number " + my + " is not Palindrome.");
        }

    }

}
