package day14_String;

public class StringsMethods2 {
    public static void main(String[] args) {

        String str = "Java is fun, i love learning Java";

         String str2= str.replace("Java", " Python");

        System.out.println("str = " + str);
        System.out.println("str2 = " + str2);

        String email= "aki.g@yahoo.com";
        String email1= email.replace("yahoo", "gmail");
        System.out.println("email = " + email);
        System.out.println("email1 = " + email1);


    }
}
