package DayWiseCoding;
//Get an input number from the user and check whether it is a positive or negative number.
import java.util.Scanner;

public class Day4 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int num=kb.nextInt();
        if(num>0)
            System.out.println("Positive number");
        else if(num<0)
            System.out.println("Negative Number");
        else
            System.out.println("Neither positive nor negative");
    }
}
