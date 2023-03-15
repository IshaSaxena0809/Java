/*
Check whether the numbers of array be made equal or not

For eg, for the following input it should print yes because

50*2*3 , 75*2*2 and 150*2 are equal to 300 in all cases. So array numbers can be made equal
 */
package DayWiseCoding;

import java.util.Scanner;

public class Day56 {
    public static boolean madeEqual(int []arr,int n)
    {
        for(int i=0;i<n;i++){
            while(arr[i]%2==0)
                arr[i]/=2;
            while(arr[i]%3==0)
                arr[i]/=3;
            if(arr[i]!=arr[0])
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int []arr= new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        if(madeEqual(arr,n))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
