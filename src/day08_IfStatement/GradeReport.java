package day08_IfStatement;

public class GradeReport {
    public static void main(String[] args) {
        System.out.println(true==!false); // ture
        System.out.println(!true !=false); // false
        System.out.println(!false ==true); // true
        System.out.println(!!false) ; // false

        System.out.println("**************************");



        /* score:
        90~100 === Excelent
        80~89 ==== Great
        70~79 ==== Good
        60~69 ==== Passed
        0~59==== Failed
       */

        int score = 77;

        boolean a = score>=90 && score<=100;
        boolean b = score>=80 && score<=89;
        boolean c = score>=70 && score<=79;
        boolean d = score>=60 && score<=69;
        boolean e = score>=0 && score<=59;

        if(a){
            System.out.println("Excelent! You are the best");
        }
        if(b) {
            System.out.println("Great!Good Job!");
        }

        if(c){
            System.out.println("Good! Nice One"); }

        if(d){
            System.out.println("Passed! not Bad");
        }

        if(e){
            System.out.println("Failed! Next Time");
        }


    }
}
