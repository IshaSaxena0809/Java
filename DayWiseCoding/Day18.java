/*
Get the values for numerator and denominator of two fractions, then add that fractions. Consider the following format

x3/y3 = (x1/y1) + (x2/y2)

here x3 = (x1*y2) + (x2*y1) and y3 = (y1*y2)
 */

package DayWiseCoding;

import java.util.Scanner;

public class Day18 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int x1=kb.nextInt();
        int y1=kb.nextInt();
        int x2=kb.nextInt();
        int y2=kb.nextInt();
        int x3 = (x1*y2) + (x2*y1) , y3 = (y1*y2);

        int div;
        if(x3>y3)
            div=y3;
        else
            div=x3;
        for(int i=div;i>0;i--)
        {
            if(x3%i==0 && y3%i==0)
            {

                x3=x3/i;
                y3=y3/i;
                break;
            }
        }
        System.out.print("Sum of fractions is "+x3+"/"+y3);
    }

    }

