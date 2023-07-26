package DayWiseCoding;

import java.util.Scanner;

public class Day74 {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {

            int n = sc.nextInt();
            int m = sc.nextInt();

            if (n % 2 == 0 && m % 2 == 0) {
                System.out.println(0);
            } else if (n % 2 == 0 && m % 2 != 0) {
                System.out.println(n);
            } else if (n % 2 != 0 && m % 2 == 0) {
                System.out.println(m);
            } else {
                System.out.println(m + n - 1);
            }
        }
    }

}
