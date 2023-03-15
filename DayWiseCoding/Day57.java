/*"Pass or Fail

Anusree is struggling to pass a certain college course.
The test has a total of N question, each question carries 3 marks for a correct answer and −1 for an incorrect answer. Anusree is a risk-averse person so he decided to attempt all the questions. It is known that Anusree got X questions correct and the rest of them incorrect. For Anusree to pass the course he must score at least P marks.
Will Anusree be able to pass the exam or not?
Input Format
First line will contain T, number of testcases. Then the testcases follow.
Each testcase contains of a single line of input, three integers N, X, P.
Output Format
For each test case output ""PASS"" if Chef passes the exam and ""FAIL"" if Chef fails the exam.

 */
package DayWiseCoding;

import java.util.Scanner;

public class Day57 {


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int tc=sc.nextInt();
        for(int i=0;i<tc;i++){
            int n=sc.nextInt();
            int x=sc.nextInt();
            int p=sc.nextInt();
            int count=0;
            for(int j=0;j<x;j++)
                count+=3;

            int diff=n-x;
            for(int j=0;j<diff;j++)
                count--;
            if(count>=p)
                System.out.println("PASS");
            else
                System.out.println("FAIL");
        }

    }
}
