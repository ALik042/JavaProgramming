package day20_Arrays;

import java.util.Arrays;

public class Month {
    public static void main(String[] args) {

        String [] month = {"January", "February","March","April","May","June","July","August","Sep","Oct","Nov","Dec"};
/*
        int number=5;

        if(number<1 || number >12){
            System.err.println("invalid Number");
            System.exit(0);
        }
        System.out.println(month[number-1]);

   */



        for(int i = month.length-1; i>=0; i-- ){ // represents the index numbers of array starting from last index
            System.out.println(month[i]);

        }

    }
}
