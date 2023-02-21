package DayWiseCoding;

import java.util.Scanner;

//Get an input string from the user and then check whether it is a palindrome string or not.
public class Day33 {
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        String str=sc.nextLine();
        str=str.toLowerCase();
        boolean flag=true;
        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i)!=str.charAt(str.length()-i-1)){
                flag=false;
                break;
            }
        }
        if(flag)
            System.out.println("Palindrome");
        else
            System.out.println("Not a Palindrome");

    }
}
