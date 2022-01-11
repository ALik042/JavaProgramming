package day19_loopPractice;

public class frequencyOfChar {
    public static void main(String[] args) {

        String str = "aabcccd";

        char ch =str.charAt(0); // 'a'
        int count=0;

        for (int i = 0; i <str.length() ; i++) {

            char each = str.charAt(i); //each character of str
            if(ch==each){
            count++;}

        } System.out.println(count);







    }
}
