package DayWiseCoding;

import java.util.Scanner;

//Get a string as the input from the user and print the non-repeating characters in a string.
public class Day38 {
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        String str=sc.nextLine();

        int frequency[] = new int[256];

        for (int i = 0; i < str.length (); i++) {

            frequency[str.charAt(i)]++;

        }

        System.out.println ("Non repeating characters are: ");

        for (int i = 0; i < 256; i++)

            if (frequency[i] == 1)

                System.out.print ((char) i + " ");
    }
}
