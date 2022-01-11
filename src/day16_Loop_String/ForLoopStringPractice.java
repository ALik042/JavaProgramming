package day16_Loop_String;

public class ForLoopStringPractice {
    public static void main(String[] args) {

        String str = "Wooden Spoon";
String result="";

/*
   result += str.charAT(11);
   result += str.charAT(0);
   result += str.charAT(0);
   result += str.charAT(0);
   result += str.charAT(0);


 */

        for (int i = str.length()-1; i >=0 ; i--){ //: index numbers of str (starting last index to index 0)
            result += str.charAt(i);

        }
        System.out.println(result);

    }
}
