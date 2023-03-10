package DayWiseCoding;

import java.util.Scanner;

//Given an integer array of size N, write a program to reverse the array;
public class Day52 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int []arr= new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }
}
