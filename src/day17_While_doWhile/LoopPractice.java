package day17_While_doWhile;

public class LoopPractice {
    public static void main(String[] args) {
        for (int i = 0; i <=10 ; i++) {
            System.out.println(i);
        }
        System.out.println("----------------------------------------");

        int j = 1;
        while (j<=10){
            System.out.println(j);
            j++;
        }

        System.out.println("---------------------------------------" );

        int k=1;
        do{
            System.out.println(k);
            k++;
        }while (k<=10);
    }
}