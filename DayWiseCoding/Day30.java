package DayWiseCoding;

import java.util.Scanner;

//Get a string as input from user and print the length of the string without using strlen() function.
public class Day30 {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        String str=new String();
        str=kb.nextLine();
        char []ch=str.toCharArray();
        int i=0;
        for(char c:ch){
            i++;
        }
        System.out.println(i);
    }
}
