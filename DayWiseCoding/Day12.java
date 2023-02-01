/*Get a number from user and then find the sum of the digits in the given number.
E.g. let the number = 341
Sum of digits is 3+4+1= 8*/
package DayWiseCoding;

import java.util.Scanner;

public class Day12 {
    public static void main(String[] args) {
        Scanner kb=new Scanner (System.in);
        int num=kb.nextInt();
        int sum=0;
        while(num>0){
            sum+=num%10;
            num/=10;
        }
        System.out.println(sum);
    }
}
