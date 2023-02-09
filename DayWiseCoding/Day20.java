package DayWiseCoding;

import java.util.Scanner;

//Get a number as input from the user and check whether that number is prime or not.
public class Day20 {
    public static void main(String[] args) {
        Scanner kb =new Scanner(System.in);
        int n=kb.nextInt();
        boolean flag=true;
        if(n==0 || n==1)
            flag=false;
        for(int i=2;i<n;i++){
            if(n%i==0) {
                flag=false;
                break;
            }
        }
        if(flag)
             System.out.println(n+" is a prime number");
        else
            System.out.println(n + " is not a prime number");

    }
}
