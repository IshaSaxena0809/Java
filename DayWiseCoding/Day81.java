package DayWiseCoding;

import java.util.Scanner;

public class Day81 {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner scan = new Scanner(System.in);
        int times = scan.nextInt();

        while(times-- > 0){
            int val = scan.nextInt();
            scan.nextLine();

            String s = scan.nextLine();
            int count = 0;
            for(int i = s.length(); i >=2 ;i--){
                if(s.substring(i-2, i).equals("10"))
                    count++;
            }
            System.out.println(count);
        }
    }
}
