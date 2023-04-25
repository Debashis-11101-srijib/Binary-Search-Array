public class BinaryNumber {

    public static void binToDec(int binNum) {
        int myNum = binNum;
        int decNum = 0;
        int pow = 0;

        while (binNum > 0) {
            int lastDigit = binNum % 10;
            decNum = decNum + (lastDigit * (int) Math.pow(2, pow));

            pow++;
            binNum = binNum / 10;

        }
        System.out.println("decimal of " + myNum + " = " + decNum);
    }

    public static void decNum(int n) {
        int my = n;

        int bin = 0;
        int pow = 0;

        while (n > 0) {
            int rem = n % 2;
            bin = bin + (rem * (int) Math.pow(10, pow));
            pow++;
            n = n / 2;

        }
        System.out.println("binary of " + my + " = " + bin);
    }

    public static void main(String[] args) {
        decNum(10);
        binToDec(1010);
    }

}