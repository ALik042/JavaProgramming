package day18_NestedLoopIntro;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your username");
        String u = scan.next();

        System.out.println("Enter your password");
        String p = scan.next();

        if(u.equals("Cydeo") && p.equals("WoodenSpoon") ){
            System.out.println("logged In");
        }else {

            for (int i = 0; i < 2; i++) {
                System.out.println("Incorrect username or password");
                System.out.println("Enter your username");
                u = scan.next();

                System.out.println("Enter your password");
                p = scan.next();


                if( u.equals("Cydeo") && p.equals("WoodenSpoon") ){
                    System.out.println("logged In");
                    break;

                }
            }

        if( !(u.equals("Cydeo") && p.equals("WoodenSpoon")) ){
            System.err.println("Your account is locked, Please contact support team");
        }




        }

        scan.close();

    }
}
