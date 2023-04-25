import java.util.*;

public class LinearSearch {
    public static int Linear(int arr[], int key) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = { 34, 6, 77, 43, 67, 90 };
        int key = sc.nextInt();
        int index = Linear(arr, key);

        if (index == -1) {
            System.out.println("NOT Found");

        } else {
            System.out.println("The array Length: " + index);
        }
    }

}
