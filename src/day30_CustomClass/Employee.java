package day30_CustomClass;

public class Employee {

    public String name;
    public int id;
    public char gender;
    public String jobTitle;
    public double salary;
    public boolean isFoolTime;
                      //   "Ali", 4242, 'M', "SDET", 142400.00, true
    // "Ali", 'M', 30, 4242, "SDET", 142400.00, true
    public void setInfo(String name, int id, char gender, String jobTitle, double salary, boolean isFoolTime) {
        this.name = name;
        this.id = id;
        this.gender = gender;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.isFoolTime = isFoolTime;
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", gender=" + gender +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", isFoolTime=" + isFoolTime +
                '}';
    }


    public void work(){
        System.out.println(name+" is working");
    }
}
/*
Employee Class:

        Attributes:
            name, id, gender, jobTitle, salary, isFullTime(boolean)

        Actions:
            toString(): to be able to print each employee object
            setInfo(): to be able to set all the attributes
            work()...

CapitalOne Class:

    1. create 5 Employee objects
    2. store those 5 employee objects into an array
    3. how many employees are full time employees?
    4. What's the minimum salary
    5. what's the maximum salary
 */