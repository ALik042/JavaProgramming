package day18_NestedLoopIntro;

import java.util.Scanner;

public class AdditionalTwoNumbers {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

     while (true) {
         System.out.println("Enter your first number");
         int num1 = scan.nextInt();

         System.out.println("Enter your second number");
         int num2 = scan.nextInt();

         System.out.println("Addition: " + (num1 + num2));
         System.out.println("Continue ?");
         String a = scan.next();
         a=a.toLowerCase();


         while ( !(a.equals("yes")|| a.equals("no")) ){
             System.out.println("Invalid re enter");
             a = scan.next();
             a=a.toLowerCase();

         }
         if (a.equals("no")){
             break;


         }scan.close();
     }



    }
}
