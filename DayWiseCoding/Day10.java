package DayWiseCoding;

import java.util.Scanner;

//Factorial of a Number
public class Day10 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int fact=1;
        for(int i=1;i<=a;i++){
            fact =fact*i;
        }
        System.out.println(fact);
    }
}
