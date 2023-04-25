public class PRIMENUMBER {

    public static boolean isprime(int n) {
        if (n == 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) { // othewise use i<=n-1;
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void PrintRange(int n) {
        for (int i = 2; i <= n; i++) {
            if (isprime(i)) { // true
                System.out.println(i);

            }
        }
    }

    public static void main(String[] args) {
        PrintRange(7);

    }

}
