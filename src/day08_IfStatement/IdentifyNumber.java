package day08_IfStatement;

public class IdentifyNumber {
    public static void main(String[] args) {

        int num=200;

        boolean positive= num>0;
        boolean negative= num<0;
        boolean zero= num==0;

        System.out.println(num+" is positive number: "+positive);
        System.out.println(num+" is negative number: "+negative);
        System.out.println(num+" is zero: "+zero);
    }
}
/*

Create a class called IdentifyNumber, and write a program that can identify if the given number is positive, or negative or zero.

            Ex:
                number = 200

            output:
                200 is positive number: true
                200 is negative number: false
                200 is zero: false
 */