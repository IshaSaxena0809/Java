//Multilevel Inheritance
package DayWiseCoding;

class Isosceles {
    void display1(){
        System.out.println("I am an isosceles triangle ");
    }
}
class Equilateral extends Isosceles{
    void display2() {
        System.out.println("I am an equilateral triangle ");
    }
}
class C extends Equilateral{
    void display3(){
        System.out.println("I am a triangle");
    }
}
public class Day69 {
    public static void main(String[] args) {
     C c=new C();
     c.display2();
     c.display1();
     c.display3();
    }
}
