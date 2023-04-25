public class eversenum {

    public static void main(String[] args) {
        int n = 10899;

        // reverse a number:--------

        // // while (n > 0) {
        // // int lastdigit = n % 10;
        // // System.out.print(lastdigit + " ");
        // // n /= 10;

        // // }
        // for (int lastdigit = n; n > 0; n = n / 10) {
        // lastdigit = n % 10;
        // System.out.print(lastdigit);
        // }

        // Reverse the Given number:------
        // int lastdigit;
        // for(lastdigit=n; n>0; n/=10){
        // lastdigit=n%10;
        // System.out.println(lastdigit);

        // } for(int rev=0; rev>0; rev++){
        // rev=((rev*10)+lastdigit);
        // System.out.println(rev);
        // }

        int rev = 0;
        while (n > 0) {
            int lastdigit = n % 10;
            rev = (rev * 10) + lastdigit;
            n /= 10;
        }
        System.out.println(rev);

    }

}
