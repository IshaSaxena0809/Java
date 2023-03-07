//Get a string from the user and find the sum of numbers in the string.
package DayWiseCoding;

import java.util.Scanner;

public class Day35 {
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        String str=sc.nextLine();
        int sum=0;
        for(int i=0;i<str.length();i++)
        {
            if(Character.isDigit(str.charAt(i))){
                sum=sum+(int)str.charAt(i)-'0';
            }
        }
        System.out.println(sum);
    }
}
