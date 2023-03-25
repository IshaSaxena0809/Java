package DayWiseCoding;

import java.util.Arrays;
import java.util.Scanner;

public class Day65 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();

        for(int i=0;i<tc;i++) {
            int n=sc.nextInt(), b=sc.nextInt();
            int arr[]=new int[n];
           for(int j=0;j<n;j++){
               int w=sc.nextInt(),h=sc.nextInt(),p=sc.nextInt();
               if(b>=p) {
                  arr[j]=w*h;
               }
           }
           Arrays.sort(arr);
            if(arr[n-1]==0) System.out.println("no tablet");
            else System.out.println(arr[n-1]);
        }
    }
}
