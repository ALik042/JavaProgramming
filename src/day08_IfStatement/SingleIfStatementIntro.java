package day08_IfStatement;

public class SingleIfStatementIntro {
    public static void main(String[] args) {
        int number = 301;


        boolean evenNumber = number % 2 == 0;

        if (evenNumber) {

            System.out.println(number + " is even number");

        }

        if (!evenNumber) {

            System.out.println(number + " is not even number");

            System.out.println("***********************************");
            int n = 0;

            //POSITIVE if the n is greater than 0
            if (n > 0) {
                System.out.println(n + " is positive");
            }
            //negative

            if (n < 0) {
                System.out.println(n + " is negative");

            }
            // zero

            if (n == 0) {
                System.out.println(n + " is zero");

            }

        }
    }
}
