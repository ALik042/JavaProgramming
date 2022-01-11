package day20_Arrays;

import java.util.Arrays;

public class letters2 {
    public static void main(String[] args) {


        char [] letters2 = new char[26];
/*
        for (char i = 'A', j = 0;  i <='Z' && j<26 ; i++, j++) { // i: index numbers 0~ last index
            letters2[j]=i;
        }System.out.println(Arrays.toString(letters2));
*/

        for (char i = 'Z', j = 0 ; i >='A' && j <=25 ;  i--, j++) {
            letters2 [j]=i;


        }System.out.println(Arrays.toString(letters2));
        System.out.println("==============================================");

        int[] number=new int[10];
        int num =1;
        for (int i = 0; i <10 ; i++) {
         number [i]=num++;


        }
        System.out.println(Arrays.toString(number));
        System.out.println("================================================");

        int[] number1 = new int[10];

        int num1=10;
        for (int i = 0; i <number1.length ; i++) {
            number1[i]=num1--;


        }
        System.out.println(Arrays.toString(number1));








    }

}
