package day20_Arrays;

import java.util.Arrays;

public class ArraysIntro {
    public static void main(String[] args) {
        // create a variable that's capable enough to contain 5 names

        String [] myGroup= new String[5];
        myGroup[0] = "Ali";
        myGroup[1] = "Andriy";
        myGroup[2] = "Alex";
        myGroup[3] = "Lirk";
        myGroup[4] = "Ozan";
        System.out.println(Arrays.toString(myGroup)); // Ali,Andriy,Alex,Lirk,Ozan
        System.out.println("==========================================================");

        String[] days= {"mon", "tue","wed","thu","fri","sat", "sunday"};
        System.out.println(Arrays.toString(days));

        int number = 5;
        if(number <1 || number >7){
            System.err.println("invalid Number");
            System.exit(0);
        }
        System.out.println(days[number-1]);


    }
}
