/*
Get an input number from user and check whether the given number is an Armstrong number or not.

E.g. Let the number be 1634,

Here 1^4 + 6^4 + 3 ^4 + 4^4 = 1634

Therefore, this is an Armstrong number
 */
package DayWiseCoding;

import java.util.Scanner;

public class Day19 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int num=kb.nextInt();
        int n=num;
        int count=0;
        while(n>0){
            n=n/10;
            count++;
        }
        n=num;
        int sum=0;
        while(n>0){
            sum+=(int)Math.pow(n%10,count);
            n/=10;
        }

        if(sum==num)
        System.out.println("Armstrong number");
        else
            System.out.println("Not an Armstrong number  ");
    }
}
