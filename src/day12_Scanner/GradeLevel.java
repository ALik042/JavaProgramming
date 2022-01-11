package day12_Scanner;

public class GradeLevel {
    public static void main(String[] args) {

        byte grade = 19;
        String result;

        switch (grade){

            case 1: case 2: case 3: case 4: case 5:result="Elementary school";break;
            case 6: case 7: case 8: result="Middle school";break;
            case 9: case 10: case 11: case 12: result = "High School";break;
            case 13: case 14: case 15: case 16: result = "Collage";break;
            case 17: case 18: result="Grad School";break;
            default:result="Invalid grade level given";

        }
        System.out.println(result);
        System.out.println("******************************************");


        if(grade>=1 && grade<=18){


            switch (grade){

                case 1: case 2: case 3: case 4: case 5:result="Elementary school";break;
                case 6: case 7: case 8: result="Middle school";break;
                case 9: case 10: case 11: case 12: result = "High School";break;
                case 13: case 14: case 15: case 16: result = "Collage";break;
                default:result="Grad School";

            }


        }else {result="Invalid grade level given";}
        System.out.println(result);
        System.out.println("******************************************");

    }
}
