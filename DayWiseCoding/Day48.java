//Get an array as input from the user and then remove all the duplicate elements in that array.
package DayWiseCoding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Day48 {
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        System.out.println("Enter size of an array: ");
        int size=sc.nextInt();
        int []a=new int[size];
        System.out.println("Enter elements: ");
        for(int i=0;i<size;i++)
            a[i]=sc.nextInt();

        Arrays.sort(a);
        int j=0;
        for (int i = 0; i < size - 1; i++) {
            if (a[i] != a[i + 1]) {
                a[j++] = a[i];
            }
        }

        a[j++] = a[size - 1];
        for(int i=0;i<j;i++)
            System.out.print(a[i]+" ");
    }
}
