package day13_String;


public class StringMethods {
    public static void main(String[] args) {
        String word = "Cydeo";
                     //01234

        char thirdChar=word.charAt(2);

        System.out.println("thirdChar = " + thirdChar);

        char tenthChar=word.charAt(4);

        System.out.println("tenthChar = " + tenthChar);

        System.out.println("********************");

        String s1 = "Yes we are the best";

        int totalChars = s1.length();

        System.out.println("totalChars = " + totalChars);


    }
}
