package DayWiseCoding;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Day90 {
    public static void main (String[] args) throws java.lang.Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t1=Integer.parseInt(br.readLine());
        for(int t=1;t<=t1;t++)
        {
            StringTokenizer tk=new StringTokenizer(br.readLine());
            int n=Integer.parseInt(tk.nextToken());
            int p=Integer.parseInt(tk.nextToken());
            String s=br.readLine();
            char c[]=s.toCharArray();
            int b=0;
            for(int i=0;i<c.length;i++)

            {
                if(s.charAt(i)=='b')
                    b++;
            }
            int a1=0;
            for(int i=c.length-1;i>=n-b;i--)
            {
                if(c[i]=='a')
                    a1++;
            }
            if(p<=a1)
            {
                int p1=p;
                for(int i=0;i<c.length&&p1>0;i++)
                {
                    if(c[i]=='a')
                        continue;
                    else
                    {
                        c[i]='a';p1--;
                    }
                }
                p1=p;
                for(int i=n-1;i>=0&&p1>0;i--)
                {
                    if(c[i]=='b')
                        continue;
                    else
                    {

                        c[i]='b';
                        p1--;
                    }
                }
                System.out.println(String.valueOf(c));
            }
            else
            {
                char c2[]=s.toCharArray();
                Arrays.sort(c2);
                int p1=p-a1;
                for(int i=n-b;i<c.length&&p1>0;i++)
                {
                    if(c[i]=='b')
                    {
                        if(p1>=2)
                        {
                            c2[i]='a';p1-=2;
                        }
                    }
                    else
                    {
                        c2[i]='a';p1--;
                    }
                }
                System.out.println(String.valueOf(c2));
            }

        }

    }
}
