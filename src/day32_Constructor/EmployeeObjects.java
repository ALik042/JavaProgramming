package day32_Constructor;

public class EmployeeObjects {

    public static void main(String[] args) {

        Employee employee1= new Employee("Ali");
        Employee employee2= new Employee("Ali",'M');
        Employee employee3= new Employee("Ali",'M',"SDET");
        Employee employee4= new Employee("Ali",'M',"SDET",120000);

        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);
        System.out.println(employee4);
    }



}
