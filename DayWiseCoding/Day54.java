// Given an integer array of size N. Write Program to find whether Arrays are disjoint or not.
// Two arrays are said to be disjoint if they have no elements in common.
package DayWiseCoding;

import java.util.Arrays;
import java.util.Scanner;

public class Day54 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        boolean flag=false;
        System.out.println("Enter size of first array: ");
        int s1= sc.nextInt();
        int []arr1=new int [s1];
        for(int i=0;i<arr1.length;i++){

            arr1[i]=sc.nextInt();

        }
        System.out.println("Enter size of second array: ");
        int s2= sc.nextInt();
        int []arr2=new int [s2];
        for(int i=0;i<arr2.length;i++){
            arr2[i]=sc.nextInt();
        }

        int s=0;
        if(s1<s2)
           s=s1;
        else
            s=s2;
        for(int i=0;i<s;i++){
           for(int j=0;j<s;j++){
               if(arr1[i]==arr2[j])
               {
                   flag=true;
                   break;
               }
           }
           if(flag)
               break;
        }
        if(!flag)
            System.out.println("Disjoint");
        else
            System.out.println("Not disjoint");
    }

}
