package day30_CustomClass;

public class Student {

    public String name;
    public char gender;
    public int age;
    public int studentID;
    public char grade;

    public void setInfo(String name, char gender, int age, int studentID, char grade) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.studentID = studentID;
        this.grade = grade;
    }

    public void eat(){
        System.out.println(name+" is eating");
    }

    public void sleep(){
        System.out.println(name+" is sleeping");
    }

    public void drink(){
        System.out.println(name+" is drinking");
    }

    public void code(){
        System.out.println(name+" is coding");
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", studentID='" + studentID + '\'' +
                '}';
    }
}
/*
Student Class:

    Attributes:
        name, gender, age, studentID

    Actions:
        eat(), sleep(), drink(), code()
        setInfo(): to set all the attributes of student object
        toString(): to print the full info of student
 */