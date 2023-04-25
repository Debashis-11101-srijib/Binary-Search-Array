import java.util.*;

public class callByValue {
    // public static void main(String[] args) {
    // // swap-value exchange
    // int a = 5;
    // int b = 10;

    // // swap
    // int temp = a;
    // a = b;
    // b = temp;
    // System.out.println("a= " + a);
    // System.out.println("b= " + b);

    // }

    public static int multiply(int a, int b) {
        int product = a * b;
        return product;
    }

    public static int factorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }

    public static int binCoe(int n, int r) {
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nr = factorial(n - r);

        int coeffi = fact_n / (fact_r * fact_nr);
        return coeffi;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Product of a & b

        // int T = sc.nextInt();
        // for (int i = 1; i < T; i++) {

        // int a = 3;
        // int b = 5;
        // int prod = multiply(a, b);
        // System.out.println("a x b =" + prod);
        // int me = multiply(34, 2);
        // System.out.println("34 x 2 =" + me);
        // }

        // ------- factorial Function

        System.out.println("Cofficient:" + binCoe(5, 2));
    }
}
