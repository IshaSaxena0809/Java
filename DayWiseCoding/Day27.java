package DayWiseCoding;
//For the given input number calculate the double of it without using arithmetic operator.
import java.util.Scanner;

public class Day27 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter number: ");
        int num =sc.nextInt();
        System.out.println(num<<1);
    }
}
