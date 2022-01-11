package day17_While_doWhile;

import java.util.Scanner;

public class PasswordBranch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Username:");
        String userName =scan.next();
        System.out.println("Enter Password:");
        String password =scan.next();

        for (int i = 0; i <3 ; i++) {
            if(userName.equals("Cydeo") && password.equals("Cydeo123")  ){
                break;
            }

         if (i==3){
             System.out.println("your account is locked");

         }
        }
        System.out.println("logged in");

    }
}
