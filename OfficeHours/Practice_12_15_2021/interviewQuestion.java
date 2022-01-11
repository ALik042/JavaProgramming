package Practice_12_15_2021;

import java.util.Scanner;

public class interviewQuestion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        String res ="";


        for (int i =0; i< str.length(); i++){

            if(str.charAt(i)==str.charAt(str.length()-i-1)){
                res +=str.charAt(i);
            }else {break;}
        }
        System.out.println(res);




    }
}

/*
           Given a string, look for a mirror image (backwards) string at both the beginning and end of the given string.
           In other words, zero or more characters at the very begining of the given string, and at the very end of the
           string in reverse order (possibly overlapping). For example, the string "abXYZba" has the mirror end "ab".

                  mirrorEnds("abXYZba") → "ab"
                  mirrorEnds("abca") → "a"
                  mirrorEnds("aba") → "aba"
         */
