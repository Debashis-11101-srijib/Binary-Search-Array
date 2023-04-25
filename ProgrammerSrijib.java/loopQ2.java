import java.util.*;

public class loopQ2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        int Choice;
        int evenSum = 0;
        int oddSum = 0;

        do {
            System.out.println("Enter The Number:");
            num = sc.nextInt();
            if (num % 2 == 0) {
                evenSum += num;
            } else {
                oddSum += num;
            }
            System.out.println("DO you want to continue? press 1 for Yes or 0 for No");
            Choice = sc.nextInt();
        } while (Choice == 1);

        System.out.println("Sum of Even Numbre:" + evenSum);
        System.out.println("Sum of Odd Number:" + oddSum);

    }

}
