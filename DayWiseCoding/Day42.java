package DayWiseCoding;

import java.util.Arrays;
import java.util.Scanner;

public class Day42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter size of first array: ");
        int s1= sc.nextInt();
        System.out.println("Enter size of second array: ");
        int s2= sc.nextInt();
        boolean flag=true;
        int []arr1=new int [s1];
        int []arr2=new int [s2];
        for(int i=0;i<arr1.length;i++){

            arr1[i]=sc.nextInt();
            arr2[i]=sc.nextInt();
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for(int i=0;i<s1;i++){
            if(arr1[i]!=arr2[i]){
                flag =false;
                break;
            }
        }
        if(flag==true)
            System.out.println("Same");
        else
            System.out.println("Not same");
    }
}
