package day37_Inheritance.phoneTask;

public class PhoneShop {
    public static void main(String[] args) {

        Iphone iphone = new Iphone("Iphone 12", "6.7 inches",1000, "Black");

        Nokia nokia = new Nokia("6700","2.2",99,"Silver");


        System.out.println(iphone);
        System.out.println(nokia);
iphone.call(911);
iphone.call(5665655);
iphone.faceTime(456456456);
iphone.faceTime("ali@gmail.com");

    }
}
