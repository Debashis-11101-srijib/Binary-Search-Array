public class SubArrays {

    public static void SuArray(int arr[]) {

        int currentSum = 0;
        int Maximum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                currentSum = 0;
                for (int k = start; k <= end; k++) {
                    currentSum += arr[k];

                }
                System.out.println(currentSum);
                if (Maximum < currentSum) {
                    Maximum = currentSum;
                }

            }
            System.out.println();

        }
        System.out.println("The Maximum Sum is " + Maximum);

    }

    public static void main(String[] args) {
        int arr[] = { 4, -7, 8, -4, 9, -2 };
        SuArray(arr);

    }

}
