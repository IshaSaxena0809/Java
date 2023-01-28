package DayWiseCoding;
//Get the values of a, b and c (coefficients of quadratic equation) as input from the user and calculate the roots and print as the output.
import java.util.Scanner;

public class Day8 {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter the value of a, b and c :");
        double a=kb.nextDouble(),b=kb.nextDouble(),c=kb.nextDouble();
         double dis=b*b-4.0*a*c;
         if(dis>0){
             //[-b±√(b2-4ac)]/2a
             double x1=( -b-Math.sqrt(dis))/2.0*a;
             double x2= (-b+Math.sqrt(dis))/2.0*a;
             System.out.printf("Root 1 =%.2f  " , x1 );
              System.out.printf( "\nRoot 2=%.2f  " , x2);
         }
         else if(dis==0){
             double x1=( -b-Math.sqrt(dis))/2.0*a;
             double x2= (-b+Math.sqrt(dis))/2.0*a;
             if(x1==x2)
                 System.out.printf("Root 1= root 2 = %.2f",x1);
         }
         else if(dis<0){
             double real = -b / (2 * a);

             double imaginary = Math.sqrt(-dis) / (2 * a);
             System.out.println("Roots  are complex and different");
             System.out.printf("First Root = %.2f+%.2fi", real, imaginary);
             System.out.printf("\nSecond Root = %.2f-%.2fi",
                     real, imaginary);
         }
         else{
             return;
         }

    }
}


