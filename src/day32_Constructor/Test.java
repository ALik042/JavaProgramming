package day32_Constructor;

import day02_HelloWorld.JavaComponents;

public class Test {

    public Test(){
        System.out.println("A");
    }

    public Test(int a){
        this();
        System.out.println("B");

    }

    public Test(double a){
        this(5);
        System.out.println("C");

    }

    public Test (String str){
        this(12.5);
        System.out.println("D");
    }


    public static void main(String[] args) {
        new Test("AAA");
    }


}
