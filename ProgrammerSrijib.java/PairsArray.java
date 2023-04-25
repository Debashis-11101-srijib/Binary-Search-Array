public class PairsArray {
    public static void Pairs(int arr[]) {
        int tpp = 0;
        for (int i = 0; i < arr.length; i++) {
            int curr = arr[i];
            for (int j = i + 1; j < arr.length; j++) {

                System.out.print("(" + curr + "," + arr[j] + ") ");
                tpp++;
            }
            System.out.println();
        }
        System.out.println("The Pairs of Arrays: " + tpp);

    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10 };
        Pairs(arr);
    }

}
