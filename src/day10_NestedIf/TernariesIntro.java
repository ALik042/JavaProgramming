package day10_NestedIf;

public class TernariesIntro {
    public static void main(String[] args) {

        int n = 100;

        if(n%2==0){
            System.out.println("Even");
        }else {
            System.out.println("Odd");
        }
        System.out.println("**************************************");

        String r1 =(n%2==0)?"Even":"Odd";

        System.out.println(r1);

        System.out.println("************************************");

        int age = 23;

       String s = (age>=23)?"Eligible":"not Eligible";

        System.out.println(s);

        System.out.println("*********************");

        int digit = 100;

        String p =  (digit>0)?"Positive":(digit<0)?"Negative":"Zero";

        System.out.println(p);






    }

}

