package DayWiseCoding;

import java.util.Scanner;
//Rotate an array
public class Day70 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        int temp = arr[arr.length-1];
        for(int i=arr.length-1;i>=1;i--)
        {
            arr[i] = arr[i-1];
        }
        arr[0] = temp;
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
