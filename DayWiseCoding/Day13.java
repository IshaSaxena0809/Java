/*
Get the input from the user for the value of n and then find the sum of first n natural numbers.

e.g. let the n value = 5

then first 5 natural numbers are 1,2,3,4,5 for which we need to find the sum

Therefore sum of first 5 natural numbers is 1+2+3+4+5 = 15
 */
package DayWiseCoding;

import java.util.Scanner;

public class Day13 {
    public static void main(String[] args) {
        Scanner kb=new Scanner (System.in);
        int num=kb.nextInt();
        int sum=0;
        for(int i=1;i<=num;i++)
            sum+=i;
        System.out.println(sum);
    }
}
