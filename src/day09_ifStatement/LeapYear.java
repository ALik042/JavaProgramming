package day09_ifStatement;

public class LeapYear {
    public static void main(String[] args) {

        int year = 2021;

        if(year%4==0){
            System.out.println("Year "+ year+" is leap year");
        }else{
            System.out.println("Year "+year+ " is not leap year");
    }}
}
