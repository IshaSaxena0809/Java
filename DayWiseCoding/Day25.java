/*

Get the value for radius from the user and calculate the area of the circle for the given radius.

Area of circle = 3.14*radius*radius
 */
package DayWiseCoding;

import java.util.Scanner;

public class Day25 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int rad= sc.nextInt();
        System.out.printf("%.2f",Math.PI*rad*rad);
    }
}
