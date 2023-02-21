package DayWiseCoding;
//Get two strings as input from the user and then concatenate it.

import java.util.Scanner;

public class Day29 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter first string");
        String s1=sc.next();
        System.out.println("Enter second string");
        String s2=sc.next();
        System.out.println(s1.concat(s2));
    }
}
