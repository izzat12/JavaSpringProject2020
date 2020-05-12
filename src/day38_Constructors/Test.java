package day38_Constructors;

public class Test {

    public Test(){

        System.out.println("Constructor");

    }

    {
        System.out.println("Instance block");

    }

    public static void main(String[] args) {

        System.out.println("Main Method");
        new Test(); // instance, constructor
       // new Test(); // instance, constructor

    }

    static {

        System.out.println("Static block");
    }



}
