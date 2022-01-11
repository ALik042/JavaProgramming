package day12_Scanner;

//import java.util.*; //wild import: imports everything from package
import java.util.Scanner;
public class ScannerPractice {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number between 1 to 7: ");
        int num= scan.nextInt();

        String result;

        if (num>=1 && num<=7 ){
            if (num==1){result="Monday";
            }else if(num==2){result="Tuesday";}
            else if(num==3){result="Wednesday";}
            else if(num==4){result="Thursday";}
            else if(num==5){result="Friday";}
            else if(num==6){result="Saturday";}
            else {result="Sunday";}

        }else{result="Invalid Number";}
        System.out.println(result);
    scan.close();
    }
}
