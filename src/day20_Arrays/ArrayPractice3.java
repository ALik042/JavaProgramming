package day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hoe many number would you like to enter ?");
        int length = scan.nextInt();      //10

        if(length<=0) {
            System.err.println("invalid entry");
            System.exit(0);
        }

        int[] numbers = new int[length];

        for (int i = 0; i <length ; i++) {
            System.out.println("Enter a number");
            numbers [i]=scan.nextInt();
        }


        System.out.println(Arrays.toString(numbers));

        scan.close();











    }
}

/*

1.
 */