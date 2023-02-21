package DayWiseCoding;

import java.util.Scanner;

/*Get an algebraic expression as input from the user and then remove all the brackets in that.
Input: 7x+(2*y)
Output: 7x+2*y
 */
public class Day34 {
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        String str=sc.nextLine();
        String s="";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!='(' && str.charAt(i)!=')')
                s=s+str.charAt(i);
        }
        System.out.println(s);
    }
}
