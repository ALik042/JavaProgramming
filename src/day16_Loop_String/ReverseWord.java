package day16_Loop_String;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseWord {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word =input.next();

        String result="";

        for (int i = word.length()-1; i >=0 ; i--) {
            result +=word.charAt(i);

        }
        System.out.println(result);


    }
}
