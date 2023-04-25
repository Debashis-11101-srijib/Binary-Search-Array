import javax.swing.event.SwingPropertyChangeSupport;

import java.util.*;

public class SyntaxParameter {

    public static void Helloworld() {
        System.out.println("Hello world!!");
        System.out.println("Hello World!!");
        System.out.println("Hello World!!");
    }

    public static int calculatesum(int num1, int num2) {// parameter or formal parameter
        int sum = num1 + num2;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = calculatesum(a, b);// argument or actual parameter
        System.out.println("sum is: " + sum);
        Helloworld();

    }

}
