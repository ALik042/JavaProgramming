package day32_Constructor;

public class CarpetObject {
    public static void main(String[] args) {

        Carpet carpet1 = new Carpet(5.5,4.5,8,true);
        Carpet carpet2 = new Carpet(4.5,3.5,6,false);
        Carpet carpet3 = new Carpet(2.5,2.5,7,false);
        Carpet carpet4 = new Carpet(1.5,5.5,9,true);

        System.out.println(carpet1);
        System.out.println(carpet2);

    }

}
