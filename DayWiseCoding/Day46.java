//Get an array as the input from the user and find the sum of the elements.
package DayWiseCoding;

import java.util.Scanner;

public class Day46 {
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        System.out.println("Enter size of an array: ");
        int size=sc.nextInt();
        int []nums=new int[size];
        System.out.println("Enter elements: ");
        for(int i=0;i<size;i++)
            nums[i]=sc.nextInt();
        int sum=0;
        for(int x:nums)
            sum+=x;
        System.out.println(sum);
    }
}
