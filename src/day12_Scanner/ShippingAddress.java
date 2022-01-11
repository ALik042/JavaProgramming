package day12_Scanner;

import java.util.Scanner;

public class ShippingAddress {
    public static void main(String[] args) {

String result;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name : ");
        String name = input.nextLine();

        System.out.println("Enter your building number :");
        String buildingNumber = input.nextLine();

        System.out.println("Enter your Street number :");
        String streetName = input.nextLine();

        System.out.println("Enter your city name");
        String cityName = input.nextLine();

        System.out.println("Enter your state");
        String state = input.next();

        System.out.println("Enter your zipcode");
        int zipcode = input.nextInt();

        System.out.println(name+"\n"+streetName+" apt "+buildingNumber+", "+cityName+", "+state+", "+zipcode );



        /*
        enter name
        enter your building nyumber
        enter yout street name
        enter your city name
        enter your state
        enter your zipcode

        display the shipping address
         */


    }
}
