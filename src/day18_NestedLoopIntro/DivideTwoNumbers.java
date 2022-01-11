package day18_NestedLoopIntro;

import java.util.Scanner;

public class DivideTwoNumbers {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c= a;
        int count =0;

        while (a>=b){
            a-=b;
            count++;

        }
        System.out.println(c+" / is "+count+", remainder is "+a);



    }
}
