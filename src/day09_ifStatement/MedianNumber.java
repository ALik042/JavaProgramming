package day09_ifStatement;

public class MedianNumber {
    public static void main(String[] args) {
        int a = 7,
                b = 5,
                c = 3;

        boolean bIsMedian = (b > a && b < c) || (b<a && b>c);
        boolean aIsMedian = (a > b && a < c) || (a<b && a>c);
        boolean cIsMedian = (c > a && c < b) || (c<a && c>b);

        if (aIsMedian) {
            System.out.println(a + " is the median number");

        } if (bIsMedian) {
            System.out.println(b + " is the median number");

        } if (cIsMedian){
            System.out.println(c+ " is the median number");
        }


    }}
/*

Create a class called MedianNumber. write a program that can find the median number between three DIFFERENT given integers

            Ex:
                a = 10, b= 15, c = 20;

            Output:
                15 is the median number
 */