package day17_While_doWhile;

public class FrequencyOfCharacter {
    public static void main(String[] args) {
        String str = "AAABBC";
        char ch = 'A';

        int frequency = 0;

        for (int i = 0; i <str.length() ; i++) { //indexes of str
            char eachChar = str.charAt(i); // eachChar: each character of str

            if(ch==eachChar){

                frequency++;
            }

        }
        System.out.println(frequency);

    }
}
