import java.util.*;

import javax.swing.plaf.synth.SynthSplitPaneUI;

public class LargestNumber {
    public static int GetLargest(int arr[]) {
        int Largest = Integer.MIN_VALUE;
        int Smallest = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > Largest) {
                Largest = arr[i];
            }
            if (arr[i] < Smallest) {
                Smallest = arr[i];

            }
        }
        System.out.println("The Mnimum Value: " + Smallest);
        System.out.println("The Maximum Value: " + Largest);

        return Largest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = { 43, 89, 66, 54, 92, 33, 8, 4 };
        int index = GetLargest(arr);

        // System.out.println("The Maximum Value: " + index);

    }

}
