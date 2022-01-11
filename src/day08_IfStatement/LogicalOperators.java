package day08_IfStatement;

public class LogicalOperators {
    public static void main(String[] args) {
        String name = "Steven";
        int age = 14;

        String citizen = "USA";

        boolean isEligibleOrNot = age>=18 && citizen =="USA";

        System.out.println(name+ " is eligible to vote: "+isEligibleOrNot);

    }

}
