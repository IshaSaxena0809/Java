package DayWiseCoding;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Day77 {
    public static void main (String[] args) throws java.lang.Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-->0)
        {
            int n=Integer.parseInt(br.readLine());
            String s=br.readLine();
            String sr[]=s.split(" ");int ar[]=new int[n];
            for (int i=0;i<n ;i++)
                ar[i]=Integer.parseInt(sr[i]);
            Arrays.sort(ar);long cout=Integer.MIN_VALUE;
            cout=(long)(ar[n-1]-ar[0])*ar[n-2];
            System.out.println(cout);
        }
    }
}
