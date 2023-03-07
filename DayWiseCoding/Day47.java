//Get an array as the input from the user and find the longest palindrome in that array.
package DayWiseCoding;

import java.util.Scanner;

public class Day47 {
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        System.out.println("Enter size of an array: ");
        int size=sc.nextInt();
        String []nums=new String[size];
        for(int i=0;i<size;i++)
            nums[i]=sc.next();
        String []s=new String[size];
        int x=0;
        for(int i=0;i<size;i++){
            boolean flag=true;
            for(int j=0;j<nums[i].length()/2;j++){
                if(nums[i].charAt(j)!=nums[i].charAt(nums[i].length()-j-1)) {
                    flag = false;
                    break;
                }
            }
            if(flag)
            {
               s[x++]=nums[i];
            }
        }
        if(x!=0)
        {
            int max = s[0].length(), count = 0;
            for (int i = 0; i < x; i++) {
                if (max < s[i].length()) {
                    max = s[i].length();
                    count++;
                }
            }

            System.out.println(s[count]);
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
}
