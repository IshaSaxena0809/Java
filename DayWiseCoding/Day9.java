package DayWiseCoding;

import java.util.Scanner;

public class Day9 {
    public static void main(String[] args) {
        Scanner kb =new Scanner(System.in);
        int n=kb.nextInt();
        int count=0,rem=0;
        while(n>0){
            n=n/10;
            count++;
        }
        System.out.println(count);
    }
}
