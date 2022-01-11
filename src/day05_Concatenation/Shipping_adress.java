package day05_Concatenation;

public class Shipping_adress {

    public static void main(String[] args) {


        String name = "ALi Ismayilov";
        String buildingNumber = "2438";
        String streetName = "Adams street";
        String city = "Boston";
        String state = "MA";
        String zipCode = "02146";
        String address = (name+"\n"+buildingNumber+" "+streetName+"\n"+city+", "+state+" "+zipCode);

        System.out.println(address);






       /* System.out.println(name+"\n"+buildingNumber+" "+streetName+"\n"+city+", "+state+" "+zipCode);

        */





    }

}


/*

Create a class called ShippingAddress.java
Declare the following variables:
name
buildingNumber
streetName
city
state
zipCode

Use concatenation to print the full shipping address

 */