package DayWiseCoding;
//Write a program to identify if the character is a vowel or consonant.
public class Day1 {
    public static void main(String[] args) throws Exception {
        char ch=(char)System.in.read();
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
            System.out.println("Vowel");
        }
        else if ((ch>65&&ch<=90) || (ch>97 && ch<=122)) {
            System.out.println("Consonant");
        }
        else {
            System.out.println("Invalid Input");
        }
    }
}
