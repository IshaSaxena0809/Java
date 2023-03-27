//CodeChef Question : Palindromic substrings
package DayWiseCoding;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Day66 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        while(t>0){
            String str1=sc.next();
            String str2=sc.next();
            List<Character> list=new ArrayList<>();
            for(int i=0;i<str1.length();i++){
                list.add(str1.charAt(i));
            }
            boolean flag=false;
            for(int i=0;i<str2.length();i++){
                if (list.contains(str2.charAt(i))){
                    flag=true;
                    break;
                }
            }
            if(flag)
                System.out.println("Yes");
            else
                System.out.println("No");

            t--;
        }
    }
}
