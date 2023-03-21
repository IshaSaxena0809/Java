/*
Anusree has decided to go to a gold mine along with N of his friends (thus, total N+1 people including Anusree go to the gold mine).
The gold mine contains a total of X kg of gold. Every person has the capacity of carrying up atmost Y kg of gold.
Will Anusree and his friends together be able to carry up all the gold from the gold mine assuming that they can go to the mine exactly once.
 */
package DayWiseCoding;

import java.util.Scanner;

public class Day62 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int tc=sc.nextInt();
        String []arr=new String [tc];
        for(int i=0;i<tc;i++) {
            int N=sc.nextInt(), X=sc.nextInt(), Y=sc.nextInt();
            N=N+1;
            Y=N*Y;
            if(Y>=X)
                arr[i]="YES";
            else
                arr[i]="NO";
        }
        for(String x:arr)
            System.out.println(x);
    }
}
