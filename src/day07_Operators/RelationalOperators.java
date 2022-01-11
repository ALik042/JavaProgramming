package day07_Operators;

public class RelationalOperators {
    public static void main(String[] args) {
        // >, >=, <, <=

        boolean result1 = 40>40; //false

        System.out.println("result1 = " + result1);

        boolean result2= 300>=150;

        System.out.println("result2 = " + result2); // true

        boolean result3 = 100>=100; // true

        System.out.println("result3 = " + result3);

        boolean result4 = 99>=100; // false

        System.out.println("result4 = " + result4);

        // credit score of 720

        int score = 745;
        boolean isEligibleForLoan= score >=720;

        System.out.println("isEligibleForLoan = " + isEligibleForLoan);


        boolean result5 = 100<120 ;
        System.out.println("result5 = " + result5);

        boolean result6= 200<100;

        System.out.println("result6 = " + result6);

        boolean result7 = 200<=200;

        System.out.println("result7 = " + result7);


        boolean result8 = 8==8;

        System.out.println("result8 = " + result8);

        boolean result9 = 5!=6;

        System.out.println("result9 = " + result9);











    }
}
