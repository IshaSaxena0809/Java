//Get a string as the input from the user and find the frequency of characters in the string.
package DayWiseCoding;

import java.util.Arrays;
import java.util.Scanner;

public class Day37 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str=sc.next();
        char ch[]=str.toCharArray();
        int freq[]=new int[str.length()];

        for(int i=0;i<str.length();i++){
            freq[i]=1;
            for(int j=i+1;j<str.length();j++){
                if(ch[i]==ch[j]){
                    freq[i]++;
                    ch[j]='0';
                }
            }
        }
        int i=0;

        for(char c: ch){
            if(c!='0' && c!=' ')
            System.out.println("The frequency of "+c+ " is "+ freq[i++]);
        }
    }

}
