package DayWiseCoding;

import java.util.Scanner;

//Get a number as input from the user and check whether the given number is odd or even
public class Day5 {
    public static void main(String[] args) {
        Scanner kb =new Scanner(System.in);
        int num= kb.nextInt();
        if(num%2==0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }

}
