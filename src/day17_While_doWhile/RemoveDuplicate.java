package day17_While_doWhile;

import java.util.Scanner;

public class RemoveDuplicate {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Letters");
        String str = scan.nextLine();

        String result ="";  //ABC

        for (int i = 0; i <str.length() ; i++) {

           String ch =""+ str.charAt(i);
        if(result.contains(ch)){
            continue;
        }

           result +=ch;

        }
        System.out.println(result);





    }
}
