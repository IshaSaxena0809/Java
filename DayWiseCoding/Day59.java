/*You are given the height H (in metres) and mass M (in kilograms) of Anusree.
The Body Mass Index (BMI) of a person is computed as M/H^2.
Report the category into which Anusree falls, based on his BMI:
Category 1: Underweight if BMI ≤18
Category 2: Normal weight if BMI ∈{19, 20,…, 24}
Category 3: Overweight if BMI ∈{25, 26,…, 29}
Category 4: Obesity if BMI ≥30
 */
package DayWiseCoding;

import java.util.Scanner;

public class Day59 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t=kb.nextInt();
        int []M=new int[t];
        int []H=new int[t];
        int []R=new int[t];
        for(int i=0;i<t;i++){
            M[i]=kb.nextInt();
            H[i]=kb.nextInt();
            R[i]= M[i]/(int)Math.pow(H[i],2);
        }
        for (int y:R)
        {
            if(y<=18)
                System.out.println(1);
            else if(y>18 && y<25)
                System.out.println(2);
            else if (y>24 && y<30)
                System.out.println(3);
            else if(y>=30)
                System.out.println(4);

        }
    }
}
