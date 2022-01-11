package day07_Operators;

public class ShortHandOperators {
    public static void main(String[] args) {

        // assignment : =

        int number = 100;
        System.out.println(number);

        number = 200;

        System.out.println(number);

        String word = "Java Programming";

        System.out.println("word = " + word);

        word = "Wooden Spoon";

        System.out.println("word = " + word);
        System.out.println("******************************************************************");

        //addition Assignment =
        int x = 100;

        System.out.println("x = " + x);

        x+=200;

        System.out.println("x = " + x);


        String str = "wood";
         str+= " spoon";

         double balance= 1000.50;
         balance+=300;

        System.out.println("balance = " + balance);


        System.out.println("****************************************");


        balance-=200;

        System.out.println("balance = " + balance);

        balance-=500;
        balance+=400;

        System.out.println("balance = " + balance);

        System.out.println("*********************************************");

        double salary= 50000.50;
        salary*=2;

        System.out.println("salary = " + salary);

        System.out.println("**********************************************");

        double number1= 25000;
        number1/=2;

        System.out.println("number1 = " + number1);

        System.out.println("**************************************************");


        double number3=100;

        number3 %=3;

        System.out.println("number3 = " + number3);

        System.out.println("**************************");

        int amount = 127; //cent

        amount%=25;

        System.out.println("amount = " + amount);

        System.out.println("********************************");
        int y = 100;

        y %=16;
        System.out.println("y = " + y);























    }
}
