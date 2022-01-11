package day16_Loop_String;

public class DigitisLettersSpecialChars {
    public static void main(String[] args) {
String str = " Cydeo12345Sch000000000ool)    (!@#$%WoodenSpoon";

String digits = ""; //12345
String letters = ""; //CydeoWoodenSpoon
String specialChars=""; // !@#$%


        for (int i = 0; i <=str.length()-1 ; i++) { // index numbers of str (0~ last index)
            char ch = str.charAt(i);  // ch: each character that we have in str

             if(ch>='0' && ch <='9'){
                 digits +=ch;

             }else if((ch>='A' && ch<= 'Z') || (ch>='a' && ch<= 'z')) {
                 letters += ch;
             }else{
                 if (ch != ' '){ // if the special character is not space
                 specialChars += ch;}


             }

        }
        System.out.println("digits = " + digits);
        System.out.println("letters = " + letters);
        System.out.println("specialChars = " + specialChars);







    }
}


