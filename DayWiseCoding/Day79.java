package DayWiseCoding;

import java.util.Scanner;

public class Day79 {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner in=new Scanner(System.in);
        int T=in.nextInt();
        for(int i=0;i<T;i++)
        {int count=0,t=0;
            int n=in.nextInt();
            String s=in.next();

            for(int j=0;j<s.length()-1;j++)
            {

                if(s.charAt(j)=='1')
                {
                    count++;
                    if(s.charAt(j)==s.charAt(j+1))
                        t++;
                }
            }
            if(s.charAt(s.length()-1)=='1'&& count==0 )
            {
                System.out.println('1');

                continue;
            }
            if(count==0)
            {
                System.out.println('0');
            }
            else
            {
                if(t==0)
                    System.out.println('1');
                else
                    System.out.println('2');
            }
        }
    }
}
