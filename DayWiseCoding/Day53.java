//Given an integer array of size N. Write Program to find maximum product subarray in a given array.
package DayWiseCoding;

import java.util.Scanner;

public class Day53 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int []nums= new int[n];
        for(int i=0;i<n;i++)
            nums[i]=sc.nextInt();
        int max = nums[0], min = nums[0], ans = nums[0];


        for (int i = 1; i < nums.length; i++) {

            // Swapping min and max
            if (nums[i] < 0){
                int temp = max;
                max = min;
                min = temp;
            }



            max = Math.max(nums[i], max * nums[i]);
            min = Math.min(nums[i], min * nums[i]);


            ans = Math.max(ans, max);
        }



        System.out.println(ans);
    }
}
