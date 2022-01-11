package day17_While_doWhile;

import java.util.Scanner;

public class LogIn {
    public static void main(String[] args) {
        //username:"Cydeo"
        //password:"Cydeo123"


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter username: ");
        String userName = scan.next();
        System.out.println("Enter password:");
        String password =scan.next();


/*
        if (attempt>=0){
            System.out.println("logged in");

            while  (  !(userName.equals("Cydeo") && password.equals("Cydeo123"))){
                System.err.println("Username or Password is not correct, Please re-enter");
                System.out.println("Enter username: ");
                userName = scan.next();
                System.out.println("Enter password:");
                password =scan.next();
                attempt--;

            }


        }else {
            System.out.println("please call customer Service");
        }
*/
        if(userName.equals("Cydeo") && password.equals("Cydeo123")  ){
            System.out.println("Logged in");

        }else {
            int attempt = 3;
            while (!(userName.equals("Cydeo") && password.equals("Cydeo123")) && attempt > 0) {
                System.err.println("incorrect username or password, please re-enter");
                System.out.println("Enter username: ");
                userName = scan.next();
                System.out.println("Enter password:");
                password = scan.next();
                attempt--;



            }

        }

        if(userName.equals("Cydeo") && password.equals("Cydeo123")  ){
            System.out.println("Logged in");

        }else {
            System.out.println("Locked");
        }




    }
}

/*
you are writing a code for the log-in function of the Cydeo Application, assume that your credentials are:
                    username: Cydeo
                    password: Cydeo123

        Ask the user to enter their credentials.
                If credentials are matched, your program should print "Logged in."
                If the credentials are not matched, the program should allow the user to have three attempts to
                 enter correct credentials and if all three attempts are failed, then print "Your account is locked."
 */