package DayWiseCoding;
//Take an integer as the input from the user and then calculate the number of digits in the given input and print it as the output.
import java.util.Scanner;

public class Day9 {
    public static void main(String[] args) {
        Scanner kb =new Scanner(System.in);
        int n=kb.nextInt();
        int count=0,rem=0;
        while(n>0){
            n=n/10;
            count++;
        }
        System.out.println(count);
    }
}
