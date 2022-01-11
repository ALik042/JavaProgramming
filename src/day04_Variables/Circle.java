package day04_Variables;

public class Circle {

    public static void main(String[] args) {

        double radius= 10;
        double PI = 3.14;
        double diameter = radius * 2;
        double area = radius * radius * PI;
        double Perimeter = 2 * radius * PI;

        System.out.println("radius = " + radius);
        System.out.println("area = " + area);
        System.out.println("Perimeter = " + Perimeter);
        System.out.println("diameter = " + diameter);





    }

}

/*

 Create a class named Circle, write a program that can calculate the area & perimeter of any given Circle
                    Hints:  PI = 3.14
                            area = radius * radius * PI
                            Perimeter = 2 * radius * PI
 */