package DayWiseCoding;
/*
Get a number as input from user and then check whether that number is a strong number or not. A number is said to be strong number if the sum of the factorial of each digit in the number is same as that of the number.
E.g. let the number be 145
Here 1! + 4! + 5! is 1 + 24 + 120 which is equal to 145 itself.
 */

import java.util.Scanner;

public class Day15 {
    public static int factorial(int n){
        if(n==0 || n==1)
            return 1;
        return n*factorial(n-1);
    }
    public static void check(int n){
        int num=n,sum=0;
        while(num>0){
            sum=sum+factorial(num%10);
            num/=10;
        }

        if(sum==n)
            System.out.println("Strong number");
        else
            System.out.println("Not a strong number");


    }
    public static void main(String[] args) {
        Scanner kb=new Scanner (System.in);
        int num=kb.nextInt();
        check(num);

    }

}
