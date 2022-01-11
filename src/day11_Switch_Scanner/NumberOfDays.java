package day11_Switch_Scanner;

import com.sun.org.apache.xpath.internal.objects.XNumber;

public class NumberOfDays {
    public static void main(String[] args) {

        int days =5;

        if(days>=0 && days<=12){
            switch (days){
                case 2:
                    System.out.println("28 days");break;
                case 4 : case 6: case 9: case 11:
                System.out.println("30 days");break;
                default:
                    System.out.println("31 days");
        }




        }else{
            System.out.println("Invalid Number");}





    }
}
/*

28 days: 2
30 days: 4,6,9,11
31 days: 1,3,5,7,8,10,12

 */