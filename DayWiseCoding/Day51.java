package DayWiseCoding;

import java.util.Scanner;

//Given an integer array of size N, write a program to sort the array;
public class Day51 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int []arr= new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        for(int i=0;i< arr.length;i++){

            for(int j=i+1;j<arr.length;j++){

                if(arr[i]>arr[j])
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }

            }

        }
        for (int x:arr) {
            System.out.print(x+" ");
        }
    }
}
