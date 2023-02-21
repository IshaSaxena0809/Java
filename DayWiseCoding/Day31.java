package DayWiseCoding;

import java.util.Scanner;

//Get an input string from user and then convert the lower case of alphabets to upper case and all upper-case alphabets into lower case.
public class Day31 {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        String str=kb.nextLine();
        String s="";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>='a' && str.charAt(i)<='z'){
                s=s+Character.toUpperCase(str.charAt(i));

            }
            else  if(str.charAt(i)>='A' && str.charAt(i)<='Z'){
                s=s+Character.toLowerCase(str.charAt(i));
            }
        }
        System.out.println(s);
    }
}
