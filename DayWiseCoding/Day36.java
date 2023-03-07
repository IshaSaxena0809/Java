package DayWiseCoding;

import java.util.Scanner;

//Get a string from the user and then change the first and last letter to uppercase.
public class Day36 {
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        String str=sc.nextLine();
        String s="";
        s=Character.toUpperCase(str.charAt(0))+str.substring(1,str.length()-1)+Character.toUpperCase(str.charAt(str.length()-1));
        System.out.println(s);
    }
}
