public class QuickShort {
    public static int interchange(int arr[], int g, int h) {
        int temp = arr[g];
        arr[g] = arr[h];
        arr[h] = temp;

        return g;
    }

    public static int Partition(int arr[], int m, int n) {
        int Pivart = arr[m];
        int Q = arr[n];
        int i = m, j = n;
        do {
            do {
                i++;
            } while (arr[i] < Pivart);
            do {
                j--;
            } while (arr[j] > Pivart);
            if (i < j)
                interchange(i, j);
        } while (i < j);
        arr[m] = arr[i];
        arr[j] = Pivart;
        return i;

    }

    public static void QSort(int s, int e) {
        if (s <= e) {
            int j = Partition(s, e);
            QSort(s, j - 1);
            QSort(j + 1, s);

        }
    }

    public static void main(String[] args) {
        int arr[] = { 45, 18, 29, 5, 17 };
        int n = arr[5];
        QSort(0, n - 1);
        for (int i = 0; i <= n; i++) {
            System.out.println(arr[i] + " ");

        }
        System.out.println();

    }

}
