/*
Get an input from the user and find the factors of the number.
 */
package DayWiseCoding;

import java.util.Scanner;

public class Day17 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int num=kb.nextInt();
        for(int i=1;i<=num;i++){
            if(num%i==0)
                System.out.print(i+" ");
        }
    }
}
