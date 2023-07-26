package DayWiseCoding;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Day87 {
    public static void main (String[] args) throws java.lang.Exception
    {
        BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int t=Integer.parseInt(bu.readLine());
        while(t-->0)
        {
            int n=Integer.parseInt(bu.readLine());
            String s[]=bu.readLine().split(" ");
            int a[]=new int[n],i;
            for(i=0;i<n;i++) a[i]=Integer.parseInt(s[i]);
            long ans=a[0]; int min=a[0];
            for(i=1;i<n;i++)
            {
                ans+=min;
                min=Math.min(min,a[i]);

            }
            ans-=a[n-1];
            ans=Math.max(ans,0);
            sb.append(ans+"\n");
        }
        System.out.print(sb);
    }
}
