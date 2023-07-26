package DayWiseCoding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Day96 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine());
        while(t-->0)
        {
            String s1 = br.readLine();
            String s2 = br.readLine();
            int len=s1.length();
            String str="";
            for(int i=0;i<len;i++)
            {
                if(s2.charAt(i)==s1.charAt(i))
                {
                    if(s1.charAt(i)=='W')
                        out.print('B');
                    else
                        out.print('W');
                }
                else
                    out.print('B');
            }
            out.println();
            out.flush();
    }
    }
}
