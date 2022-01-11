package day34_GarbageCollection_AccessModifers;
import static day34_GarbageCollection_AccessModifiers.Circle.*;
import static utilities.MathUtility.*;

public class Test {

    public static void main(String[] args) {

        System.out.println(pi);
        System.out.println(name);
        System.out.println(numbers);

        System.out.println("======================================");

        // find the sum of 10, 20
        int a =sum(10,20);
        int c =subtract(20,10);

        System.out.println(a);

        // find the sum of 100, 200

        int b = sum(100,200);

        System.out.println(b);

    }

}