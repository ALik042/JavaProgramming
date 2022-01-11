package day16_Loop_String;

public class UniqueCharacters {
    public static void main(String[] args) {

        String str = "aaabccc";
                    //0123456

        String result= "";

        for(int i = 0; i <=str.length()-1; i++){ // i: index numbers oif str (startong from 0 )

            char ch = str.charAt(i); // ch: each characters of str
            if(str.indexOf(ch) == str.lastIndexOf(ch)){// if the first and last index numbers of the character are same
                result += ch;
            }

        }
        System.out.println(result);




    }
}
