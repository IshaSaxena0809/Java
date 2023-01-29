package DayWiseCoding;

import java.util.Scanner;

//Write a program to find Fibonacci series up to n
public class Day11 {
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        int n=sc.nextInt();
        int a=0,b=1,sum=0;
        for(int i=0; i<n;i++){
            System.out.print(a+" ");
            sum=a+b;
            a=b;
            b=sum;
        }
    }
}
