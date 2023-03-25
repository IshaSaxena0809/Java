/*Lots of geeky customers visit our Amit's restaurant everyday. So, when asked to fill the feedback form, these customers represent the feedback using a binary string (i.e a string that contains only characters '0' and '1'.
Now since Amit is not that great in deciphering binary strings, he has decided the following criteria to classify the feedback as Good or Bad :
If the string contains the substring "010" or "101", then the feedback is Good, else it is Bad.
Note that, to be Good it is not necessary to have both of them as substring.
So given some binary strings, you need to output whether according to the Amit, the strings are Good or Bad.
 */
package DayWiseCoding;

import java.util.Scanner;

public class Day64 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for(int i=0;i<tc;i++) {
        String str=sc.next();
        if(str.contains("010") || str.contains("101"))
            System.out.println("Good");
        else
            System.out.println("Bad");
        }
    }
}
