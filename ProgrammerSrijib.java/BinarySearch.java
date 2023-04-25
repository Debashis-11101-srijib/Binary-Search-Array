import java.util.*;

public class BinarySearch {

    public static int BinSearch(int arr[], int key) {
        int start = 0;
        int end = arr.length - 1;

        for (int i = 0; i <= arr.length; i++) {
            int mid = (start + end) / 2;
            if (arr[mid] == key) {
                return mid;
            }
            if (arr[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = { 45, 64, 78, 82, 84, 86, 93, 96 };
        int key = sc.nextInt();

        if (BinSearch(arr, key) == -1) {
            System.out.println("Not Found");
        } else {
            System.out.println("The Binary Search Number: " + BinSearch(arr, key));
        }

    }

    public int binarySearch(int[] arr, int i, int j, int x) {
        return 0;
    }

}
