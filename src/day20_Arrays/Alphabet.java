package day20_Arrays;

import java.util.Arrays;

public class Alphabet {
    public static void main(String[] args) {
        char[] alphabets =new char[26]; //A~Z
/*
                  i    ch
        alphabets[0] ='Z';  90
        alphabets[1] ='Y'; 89
        alphabets[2] =88;
        alphabets[3] =87;
        alphabets[4] =86;


        System.out.println(Arrays.toString(alphabets)); // print the whole array
        System.out.println(alphabets[0]);  // printing the element of array
*/

        char ch ='Z';
        for (int i = 0; i < alphabets.length; i++,ch--) {
            alphabets[i] =ch;

        }
        System.out.println(Arrays.toString(alphabets));





    }
}
