public class patternsPart2 {

    public static void isParttern(int Rows, int Cols) {
        // outer loop
        for (int i = 1; i <= Rows; i++) {
            // inner-Clos
            for (int j = 1; j <= Cols; j++) {
                // Cell-(i,j)
                if (i == 1 || i == Rows || j == 1 || j == Cols) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        isParttern(12, 13);

    }

}
