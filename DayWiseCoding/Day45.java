package DayWiseCoding;

import java.util.Scanner;

//Get an array as input from the user and then find the smallest and largest element in the array.
public class Day45 {
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        System.out.println("Enter size of an array: ");
        int size=sc.nextInt();
        int []nums=new int[size];
        System.out.println("Enter elements: ");
        for(int i=0;i<size;i++)
            nums[i]=sc.nextInt();
        int max=nums[0],min=nums[0];
        for(int x:nums){
            if(x>max)
              max=x;
            else if (x<min)
                min=x;
        }
        System.out.println("Smallest Number :"+min);
        System.out.println("Largest Number :"+max);

    }
}
