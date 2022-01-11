package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice3 {
    public static void main(String[] args) {


        Scanner input= new Scanner(System.in);
        System.out.println("Enter your name: ");

        String name = input.nextLine();

        System.out.println("Enter your Programming Language");

        String Programming = input.nextLine();
        System.out.println("Enter your age");
        int age = input.nextInt();
        input.nextLine();
        System.out.println("Enter your School Name:");
        String schoolName = input.nextLine();
        System.out.println("name = " + name);
        System.out.println("Programming = " + Programming);
        System.out.println("age = " + age);
        System.out.println("schoolName = " + schoolName);


        input.close();
    }
}
