package DayWiseCoding;

import java.util.Scanner;

//Get an array as input from the user and check the type of the array, whether it is odd, even or mixed type.
public class Day43 {
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        System.out.println("Enter size of an array: ");
        int size=sc.nextInt();
        int []nums=new int[size];
        System.out.println("Enter elements: ");
        for(int i=0;i<size;i++)
            nums[i]=sc.nextInt();
        byte even=0,odd=0,mix=0;
        for(int x:nums){
            if(x%2==0)
               even++;
            else if(x%2==1)
                odd++;

        }
        if(even==nums.length)
            System.out.println("Even");
        else if(odd==nums.length)
            System.out.println("Odd");
        else
            System.out.println("Mixed");
    }
}
