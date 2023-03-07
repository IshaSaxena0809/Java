package DayWiseCoding;

import java.util.Arrays;
import java.util.Scanner;

//Get two strings as input from the user and check whether it is Anagram or not.
public class Day39 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str1=sc.next();
        String str2=sc.next();
        char s1[]=str1.toCharArray();
        char s2[]=str2.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(s2);
        boolean flag=true;
        for (int i=0;i<s1.length;i++){

            if(s1[i]!=s2[i]){

                flag=false;
                break;
            }

        }
        if(flag)
            System.out.println("Anagram");
        else
            System.out.println("Not an Anagram");
        }

    }

