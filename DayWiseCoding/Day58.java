/*
Nejiya has a bucket having a capacity of K liters. It is already filled with X liters of water.
Find the maximum amount of extra water in liters that Nejiya can fill in the bucket without overflowing.
Input Format
The first line will contain T - the number of test cases. Then the test cases follow.
The first and only line of each test case contains two space separated integers K and X - as mentioned in the problem.
Output Format
For each test case, output in a single line, the amount of extra water in liters that Nejiya can fill in the bucket without overflowing.
 */
package DayWiseCoding;

import java.util.Scanner;

public class Day58 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t=kb.nextInt();
        int []k=new int[t];
        int []x=new int[t];
        int []r=new int[t];
        for(int i=0;i<t;i++){
            k[i]=kb.nextInt();
            x[i]=kb.nextInt();
            r[i]= k[i]-x[i];
        }
        for (int y:r)
            System.out.println(y);
    }
}
