/*No play and eating all day makes your belly fat.
This happened to Manish during the lockdown.
His weight before the lockdown was w1 kg (measured on the most accurate hospital machine) and after M months of lockdown, when he measured his weight at home (on a regular scale, which can be inaccurate),
 he got the result that his weight was w2 kg (w2>w1).
Scientific research in all growing kids shows that their weights increase by a value between x1 and x2 kg (inclusive) per month, but not necessarily the same value each month.
Manish assumes that he is a growing kid. Tell him whether his home scale could be giving correct results.
 */
package DayWiseCoding;

import java.util.Scanner;

public class Day63 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        int[] arr = new int[tc];
        for(int i=0;i<tc;i++) {
            int w1=sc.nextInt(), w2=sc.nextInt(), x1=sc.nextInt(),x2=sc.nextInt(),m=sc.nextInt();

            if((w1+(x1*m))<=w2 && (w1+(x2*m))>=w2){
                arr[i]=1;
            }

            else{
                arr[i]=0;
            }
        }
  for(int x:arr)
      System.out.println(x);
    }
}
