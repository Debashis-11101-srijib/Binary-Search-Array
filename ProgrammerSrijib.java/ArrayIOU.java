import java.util.*;

public class ArrayIOU {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int marks[] = new int[100];
        marks[0] = sc.nextInt();// phy
        marks[1] = sc.nextInt();// Math
        marks[2] = sc.nextInt();// chem

        // printed yout\r Array

        System.out.println("phy: " + marks[0]);
        System.out.println("Math: " + marks[1]);
        System.out.println("Chem: " + marks[2]);

        // update your Array

        marks[2] = marks[1] + 10;
        System.out.println("chem: " + marks[2]);
    }

}
