import java.util.*;

public class PassingArray {

    public static void update(int mark[]) {
        for (int i = 0; i < mark.length; i++) {
            mark[i] = mark[i] + 1;
        }
    }

    public static int LinearSearch(int arr[], int key) {

        for (int i = 0; i <= arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }

        }
        return -1;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // int mark[] = { 98, 90, 96 };
        // update(mark);

        // // update
        // for (int i = 0; i < mark.length; i++) {
        // System.out.print(mark[i] + " ");
        // }
        // System.out.println();

        int arr[] = { 2, 4, 33, 10, 45, 56, 34, 55 };
        int key = sc.nextInt();
        int indx = LinearSearch(arr, key);
        if (indx == -1) {
            System.out.println("Not Found.");
        } else {
            System.out.println("key is at index");
        }

    }

}
