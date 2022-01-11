package day12_Scanner;

import java.util.Scanner;

public class GradeReport {
    public static void main(String[] args) {

        Scanner grade= new Scanner(System.in);
        String result = "";
        System.out.println("Enter your score");
        int score = grade.nextInt();
       
        if (score>=0 && score<=100){

            if (score>=90&& score<=100){
                result="A";
            }else if(score>=80&& score<=89){result="B";}
            else if(score>=70&& score<=79){result="C";}
            else if(score>=60&& score<=69){result="D";}
            else {result="F";}


        }else{result="Invalid score";}

        System.out.println(result);
        



    }
}
