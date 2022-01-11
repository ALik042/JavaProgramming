package day17_While_doWhile;

public class BranchingStatement2 {
    public static void main(String[] args) {

        for (char i = 'A'; i <='L' ; i++) {

            if(i=='C'){
                continue;
            }

            System.out.println(i);
        }

        System.out.println("____________________________________");


        // print all even numbers 1~10

        for (int i = 1; i <11 ; i++) {

            if(!(i%2==0)){
                continue;

            }System.out.println(i);

        }
        System.out.println("--------------------------");
// print all even numbers 1~10



        for (int i = 0; i <11 ; i++) {

            if(i%2==0){
                continue;

            }System.out.println(i);

        }








    }

}
