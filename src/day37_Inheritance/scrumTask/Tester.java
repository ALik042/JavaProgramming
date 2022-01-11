package day37_Inheritance.scrumTask;

public class Tester extends Employee{

    public Tester(String name, int age, char gender, String jobTitle, int id, double salary, String companyName) {
        super(name, age, gender, jobTitle, id, salary, companyName);
    }

    public void test(){
        System.out.println(name+" is testing the code");
    }




}
