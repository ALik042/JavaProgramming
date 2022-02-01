package day01_JavaIntro;

import java.util.Scanner;

public class Test2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        String result = "";

        for (int i = word.length()-1; i >=0 ; i--) {
            result += word.charAt(i);

        }

            System.out.println(result);





    }



}
