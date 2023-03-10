package DayWiseCoding;
//Given an integer array of size N. Write Program to find sum of positive square elements in the array.
import java.util.Scanner;

public class Day50 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int []arr= new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        int sq=0;
        for(int x:arr)
            sq+=Math.pow(x,2);
        System.out.println(sq);
    }
}
