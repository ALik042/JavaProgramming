package day19_loopPractice;

public class UniqueCharacters {
    public static void main(String[] args) {

        String str = "aabccdeef";
        String result = ""; //bdf

        for (int j = 0; j < str.length(); j++) {
            char ch = str.charAt(j);    // outer
            int count = 0; // represent the frequency of the char

            for (int i = 0; i <str.length() ; i++) { //inner loop compares the character
                char each = str.charAt(i); // each character of string
                if(ch==each){
                    count++;
                }
            }
                 if(count==1){ // if the frequency of the character is 1, then the caharcter is unique
                     result +=ch;

                 }


        }

        System.out.println(result);








    }
}
/*
     str = "aabccccdeeef"
     output= bdf

 */