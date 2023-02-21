package DayWiseCoding;

import java.util.Scanner;

//Get an input string from user and print it in reverse order.
public class Day28 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String str=kb.next();
        for(int i=str.length()-1;i>=0;i--){
            System.out.print(str.charAt(i));
        }
    }
}
