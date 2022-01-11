package day07_Operators;

public class UnaryOperators {
    public static void main(String[] args) {
        int num1 = +25;
        int num2 = -25;

        System.out.println(num1 < 0);


        int a = 5;

        System.out.println(++a);//6
        System.out.println(a++);//6
        System.out.println(a);//7



        /*
        ++a; pre increment: increases the value by 1 right away
        --a: pre decrement: decreases the value by 1 right away
        a++  post increment first passes the current value, then increases the value by 1
        a--  post decrement first passes the current value, then decreases the value by 1
         */


    }
}
