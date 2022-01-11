package day16_Loop_String;

public class RemoveDuplicate {
    public static void main(String[] args) {

        String str = "aabbaacc";
                    //01234567
        String result = ""; //abc

        for (int i = 0; i <=str.length()-1; i++) {  // i represents the all the index numbers of str (start )
            String ch =""+ str.charAt(i); // represents each Character of str

           if(!result.contains(ch)){ // if the character is not contained in the result
            result +=ch; // the character will be added to the result

           }

        }
        System.out.println(result);



    }
}
