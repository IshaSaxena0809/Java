/*you will be given queries. Each query is of one of the following three types: :
Add an element to the set. :
Delete an element from the set. (If the number is not present in the set, then do nothing). :
If the number is present in the set, then print "Yes"(without quotes) else print "No"(without quotes).
 */
package DayWiseCoding;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Day68 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int tc=sc.nextInt();
        List<Integer> list=new ArrayList<>();
        while(tc>0){
            int query=sc.nextInt();
            int num=sc.nextInt();
            if(query==1)
            {
                list.add(num);
            }
            else if(query==2){
                for(int i=0; i<list.size();i++){
                    if(list.contains(num)){
                        list.remove(i);
                        break;
                    }
                }
            }
            else if(query==3){
                if(list.contains(num)){
                    System.out.println("Yes");
                }
                else{
                    System.out.println("No");
                }
            }
            tc--;
        }
    }
}
