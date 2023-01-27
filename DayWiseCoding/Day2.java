package DayWiseCoding;
//Write a program to identify if the character is an alphabet or not.

import java.io.IOException;

public class Day2 {
    public static void main(String[] args) throws IOException {
        char ch=(char)System.in.read();
        if ((ch>='A' && ch<='Z') || (ch>='a' && ch<='z'))
            System.out.println("Alphabet");
        else
        System.out.println("Not an alphabet");
    }
}
