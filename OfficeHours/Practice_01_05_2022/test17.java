package Practice_01_05_2022;

import java.util.Scanner;

public class test17 {

    public static int action (){
        return 0;
    }

    public static int action(int i){
        return i * 2;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total =0;
        total +=action(input.nextBoolean());
        total +=action(input.nextInt());
        total +=action();
        total +=action(input.next());
        total +=action(input.next());
        System.out.println(total);
    }

    public static int action(String s){
        return s.length();
    }

    public static int action(boolean b){
        if(!b){
            return 5;
        }else {
            return 10;
        }
    }





}
