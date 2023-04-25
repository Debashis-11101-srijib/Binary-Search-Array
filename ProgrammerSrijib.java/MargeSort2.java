public class MargeSort2 {

    public static void marge(int arr[], int s, int e) {
        int mid = (s + e) / 2;
        // new array length
        int n1 = mid - s + 1;
        int n2 = e - mid;

        // new array
        int left[] = new int[n1];
        int right[] = new int[n2];

        // copy
        int k = s;
        for (int i = 0; i < n1; i++) {
            left[i] = arr[k++];
        }
        k = mid + 1;
        for (int i = 0; i < n2; i++) {
            right[i] = arr[k++];
        }

        // marge 2 sorted Array
        int index1 = 0;
        int index2 = 0;
        k = s;
        while (index1 < n1 && index2 < n2) {
            if (left[index1] < right[index2]) {
                arr[k++] = left[index1++];
            } else {
                arr[k++] = right[index2++];
            }
        }

        while (index1 < n1) {
            arr[k++] = left[index1++];
        }
        while (index2 < n2) {
            arr[k++] = right[index2++];
        }

    }

    public static void margesort(int arr[], int s, int e) {
        if (s < e) {

            int mid = (s + e) / 2;
            margesort(arr, s, mid);
            margesort(arr, mid + 1, e);
            marge(arr, s, e);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 12, 11, 13, 5, 6, 7 };
        System.out.println("Given Arrayy" + arr);
        int n = arr.length;
        margesort(arr, 0, n - 1);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
