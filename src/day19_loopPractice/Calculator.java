package day19_loopPractice;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first number");
        int num1 =scan.nextInt();

        System.out.println("Enter math operator");
        char operator=scan.next().charAt(0);

        if(!(operator=='+' || operator=='-')){

            System.err.println("Invalid Math operator");
            System.exit(0);
        }

        System.out.println("Enter second number");
        int num2 = scan.nextInt();


    }
}
