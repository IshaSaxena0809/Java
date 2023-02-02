/*
Get the input from the user and check whether that number is a perfect number or not.

E.g. Let number is 28, factors of 28 are 1,2,4,7,14. Now the sum of all these factors are 28 itself.
 */
package DayWiseCoding;

import java.util.Scanner;

public class Day16 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int num=kb.nextInt();
        int sum=0;
        for(int i=1;i<num;i++){
            if(num%i==0)
                sum=sum+i;
        }
        if(num==sum)
        System.out.println("Perfect Number");
        else
            System.out.println("Not a perfect number");
    }
}
