/*
Get a number as input from the user and express that number as sum of two prime numbers.
 */
package DayWiseCoding;

import java.util.Scanner;

public class Day22 {
    static boolean checkPrime(int n) {
        boolean flag = true;
        if (n == 0 || n == 1)
            flag = false;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                flag = false;
                break;
            }
        }
            return flag;
    }
    public static void main(String[] args) {
        Scanner kb=new Scanner (System.in);
        int n=kb.nextInt();
        boolean flag=false;
        for(int i=2;i<=n/2;i++){
            if(checkPrime(i)){
                if(checkPrime(n-i)){
                    System.out.println(n+" can be expressed as sum of "+i +" and "+(n-i));
                    flag=true;
                }
            }
        }
        if(!flag)
            System.out.println(n+" can't be expressed");


    }
}
