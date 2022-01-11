package day30_CustomClass;

public class StudentObjects {
    public static void main(String[] args) {

        Student student= new Student();

       student.setInfo("Ali",'M',30,4242,'A');

        student.eat();
        student.drink();
        student.sleep();
        student.code();
        System.out.println(student);


    }
}
