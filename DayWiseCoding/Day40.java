/*
Get a string as input from the user and then get another string which has to be removed from the string.

Get the third input, the new substring which is placed in that substring position.

Finally print the output by replacing the substring with new string.
 */
package DayWiseCoding;

import java.util.Scanner;

public class Day40 {
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        System.out.println("Enter a string1:");
        String s1=sc.nextLine();

        System.out.println("Enter the substring to be removed :");
        String s2=sc.next();

        System.out.println("Enter the new substring :");
        String s3=sc.next();
        System.out.println(s1.replace(s2,s3));

    }
}
