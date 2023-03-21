/*
The weather report of Magicland is Good if the number of sunny days in a week is strictly greater than the number of rainy days.

Given 7 integers A1,A2,A3,A4,A5,A6,A7 where Ai=1 denotes that the ith day of week in Magicland is a sunny day, Ai=0 denotes that the ith day in Magicland is a rainy day. Determine if the weather report of Magicland is Good or not.
 */
package DayWiseCoding;

import java.util.Scanner;

public class Day60 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int tc=sc.nextInt();
        String []s=new String[tc];
        int []arr=new int [7];
        for(int i=0;i<tc;i++){
            int odd=0,even=0;
           for(int j=0;j<7;j++)
               arr[j]=sc.nextInt();
           for(int j=0;j<7;j++)
           {
               if(arr[j]%2==0)
                   even++;
               else if(arr[j]%2==1)
                   odd++;
           }
           if(odd>=even)
               s[i]="Yes";
           else
               s[i]="No";

        }
        for (String str:s) {
            System.out.println(str);
        }
    }
}
