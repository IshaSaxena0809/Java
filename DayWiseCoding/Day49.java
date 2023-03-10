package DayWiseCoding;

import java.util.Scanner;

public class Day49 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter size of array: ");
        int s1= sc.nextInt();

        boolean flag=true;
        int []arr1=new int [s1];
        int []arr2=new int [s1];
        for(int i=0;i<arr1.length;i++){

            arr1[i]=sc.nextInt();
            arr2[i]=sc.nextInt();
        }
        int sp=0;
        for(int i=0,j=s1-1;i<s1 && j>=0;i++,j--){
            sp=sp+arr1[i]*arr2[j];
        }
        System.out.println(sp);
    }
}
