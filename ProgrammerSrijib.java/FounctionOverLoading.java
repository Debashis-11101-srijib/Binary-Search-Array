public class FounctionOverLoading {

    // //func to cal int sum 2 para
    // public static int sum(int a, int b) {
    // return a + b;
    // }
    // //func to cal int sum 3 para
    // public static int sum(int a, int b, int c) {
    // return a + b + c;
    // }

    // func to cal int sum
    public static int sum(int a, int b) {
        return a + b;
    }

    // func to cal float sum
    public static float sum(float a, float b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println(sum(2, 6));
        System.out.println(sum(3.6f, 4.4f));

    }

}
