/*
Get an input from the user and the print the reverse of the given number as the output

E.g. let the number be 324 then the reverse of the number is 423
 */

package DayWiseCoding;

import java.util.Scanner;

public class Day14 {
    public static void main(String[] args) {
        Scanner kb=new Scanner (System.in);
        int num=kb.nextInt();
        int sum=0;
        while(num>0){
            sum=sum*10+num%10;
            num/=10;
        }
        System.out.println(sum);
    }
}
