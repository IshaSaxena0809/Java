package DayWiseCoding;

import java.util.Scanner;

public class Day32 {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        String str=kb.nextLine();
        String s="";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'||str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U'){
               continue;
            }
            s=s+str.charAt(i);
        }
        System.out.println(s);
    }
}
