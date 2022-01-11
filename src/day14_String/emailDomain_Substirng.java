package day14_String;

import day13_String.StringIntro;

public class emailDomain_Substirng {
    public static void main(String[] args) {

        String email = "ali.ismayilov@gmail.com";

        int beginningIndex = email.indexOf("@")+1;
        int endingIndex=email.lastIndexOf(".");

        String domain= email.substring(beginningIndex,endingIndex);

        System.out.println(domain);

        System.out.println("-------------------------------------------");

        String str1 ="Java is fun, Java is cool";
                  // 01234567891011
        //
        String s1 = str1.substring(0,10+1);

        int beg = str1.lastIndexOf("J");
        String s2 = str1.substring(beg);

        System.out.println(s1);
        System.out.println(s2);






    }
}
