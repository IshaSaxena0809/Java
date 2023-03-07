package DayWiseCoding;

import java.util.Scanner;

//Get an array as input from the user and then count the number of even and odd elements present in the array.
public class Day44 {
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        System.out.println("Enter size of an array: ");
        int size=sc.nextInt();
        int []nums=new int[size];
        System.out.println("Enter the elements: ");
        for(int i=0;i<size;i++)
            nums[i]=sc.nextInt();
        byte even=0,odd=0;
        for(int x:nums){
            if(x%2==0)
                even++;
            else if(x%2==1)
                odd++;

        }
        System.out.println("Number of even elements :"+even);
        System.out.println("Number of odd elements :"+odd);

    }
}
