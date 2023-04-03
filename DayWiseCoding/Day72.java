/*
In this problem you will have to implement a simple editor. The editor maintains the content of a string S and have two following functions:
"+ i x": insert a string x into the current string S after the i'th character of the S (we use 1-indexing in this problem). When i equals to 0 it mean we add x at the beginning of S.
"? i len": Print the sub-string of length len starting at position i'th of S.
At the beginning, the editor holds an empty string. There will be Q queries of the two types described above.
*/
package DayWiseCoding;

import java.util.Scanner;

public class Day72 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int tc = 0; tc < T; ++tc) {
            String s =new String();
            s=sc.next();

            if (s.charAt(0) == '+') {
                int i = 0;

                    for (; i < s.length(); i++) {
                        if (s.charAt(1)-'0' == i) {

                            sb.append(s.substring(2, s.length()));
                        }
                    }

                 sb.toString();

            }
            if (s.charAt(0) == '?') {
                int start=s.charAt(1)-'0';
                int end =s.charAt(2)-'0';

                System.out.println(sb.substring(start-1,end));
            }
        }
    }
}

