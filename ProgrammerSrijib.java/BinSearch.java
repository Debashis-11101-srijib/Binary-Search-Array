public class BinSearch {
    public static int BiSearch(int arr[], int s, int e, int key) {
        if (e >= s) {
            int mid = s + ((e - s) / 2);
            if (key == arr[mid])
                return mid;
            else if (key < arr[mid])
                return BiSearch(arr, s, mid - 1, key);
            else
                return BiSearch(arr, mid + 1, e, key);

        }
        return -1;

    }

    public static void main(String[] args) {
        int arr[] = { 6, 9, 2, 8, 3, 20, 32, 160000000 };

        int indx = BiSearch(arr, 0, arr.length - 1, 20);
        if (indx == -1)
            System.out.println("Ellement Not Found");
        else
            System.out.println("Element Found it indx: " + indx);

    }

}
