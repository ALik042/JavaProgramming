package day20_Arrays;

import java.sql.Array;
import java.util.Arrays;

public class ArraysPractice {
    public static void main(String[] args) {

        // store the elements : 10,20, 50,70
    int[] numbers = {10,20,50,70}; //size 4

        System.out.println(Arrays.toString(numbers));
        System.out.println("===================================");

        //create a variable that can contain 5 scores

        int[] scores=new int[5];
        scores [1]=85;
        scores [scores.length-1]=95;
        scores [3]=75;

        System.out.println(Arrays.toString(scores));


    }
}
