package DayWiseCoding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class Day91 {
    public static void main(String[] args) throws NumberFormatException, IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-->0)
        {
            int n=Integer.parseInt(br.readLine());
            HashMap<String,String> start=new HashMap<String,String>();
            HashMap<String, String> end=new HashMap<String, String>();
            ArrayList<Integer> cost=new ArrayList<Integer>();
            int i;
            String[] str;
            int total=0;
            for(i=0;i<n-1;i++)
            {

                    str=br.readLine().split(" ");
                start.put(str[0],str[1]);
                end.put(str[1],str[2]);
                total=total + Integer.parseInt(str[2].replace("$", ""));
            }
            String costAns=total+"$";
            String startCountry="";
            Iterator<String> it=start.keySet().iterator();
            while(it.hasNext())
            {
                String c1=it.next();
                if(!end.containsKey(c1))
                {
                    startCountry=c1;
                    break;
                }
            }
            for(i=0;i<n-1;i++)
            {
                System.out.println(startCountry+" "+start.get(startCountry)+" "+end.get(start.get(startCountry)));
                        startCountry=start.get(startCountry);
            }
            System.out.println(costAns);

        }
    }
}
