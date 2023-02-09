/*
Get a number as input from the user and find the zeros present in that number.

Then convert the zeros into one and then print it.
 */
package DayWiseCoding;

import java.util.Scanner;

public class Day23 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        StringBuilder sb= new StringBuilder();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='0')
               sb.append("1");
            else
            sb.append(str.charAt(i));
        }
        System.out.println(sb);

    }
}
