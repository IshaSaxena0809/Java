package DayWiseCoding;

import java.util.Scanner;

public class Day61 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int tc=sc.nextInt();
        int []arr=new int [tc];
        for(int i=0;i<tc;i++) {
            int a = sc.nextInt(), b = sc.nextInt();

            if((a+b)<3)
                arr[i]=1;
            else if((a+b)>=3 && (a+b)<=10)
                arr[i]=2;
            if((a+b)>=11 && (a+b)<=60)
                arr[i]=3;
            if((a+b)>60)
                arr[i]=4;

        }
        for(int x:arr)
            System.out.println(x);
    }
}
