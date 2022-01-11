package day13_String;

public class StringIntro {

    public static void main(String[] args) {


        String name =  "Wooden Spoon";
        String name2 = "Wooden Spoon";
        String name3 = "Wooden Spoon";
        String name4 = "Wooden Spoon";

        System.out.println(name==name2);

        System.out.println("***********");

        String n= new String("Wooden Spoon");
        String n2= new String("Wooden Spoon");

        System.out.println(n==n2);

        System.out.println("**************");

        String s1 = "java";
        String s2 = new String("Java");

        System.out.println(s1.equals(s2));

        System.out.println("***************");
        String s3 = "java";
        String s4 = new String("java");

        System.out.println(s3.equals(s4));




    }
}
