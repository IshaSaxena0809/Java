package DayWiseCoding;
//Get a number as input from the user and check whether that number is a Palindrome or not.

import java.util.Scanner;

public class Day21 {
    public static void main(String[] args) {
        Scanner kb=new Scanner (System.in);
        int n=kb.nextInt();
        int num=n;
        int sum=0;
        while(num>0){
            sum=sum*10+num%10;
            num/=10;
        }
        if(n==sum)
            System.out.println("Palindrome");
        else
            System.out.println("Not a Palindrome");
    }
}
