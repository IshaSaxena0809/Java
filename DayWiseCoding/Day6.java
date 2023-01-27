package DayWiseCoding;

import java.util.Scanner;

public class Day6 {
    public static void main(String[] args) {
        Scanner kb = new Scanner (System.in);
        int x=kb.nextInt();
        int y=kb.nextInt();
        if(x>0 && y>0)
            System.out.println("This point lies in first quadrant.");
        else if(x<0 && y>0)
            System.out.println("This point lies in second quadrant.");
        else if(x<0 && y<0)
            System.out.println("This point lies in third quadrant.");
        else if(x>0 && y<0)
            System.out.println("This point lies in fourth quadrant.");
        else
            System.out.println("Invalid Input!");
    }
}
