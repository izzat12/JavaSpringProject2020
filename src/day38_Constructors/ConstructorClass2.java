package day38_Constructors;


public class ConstructorClass2 {

    public ConstructorClass2(){

        System.out.println("Default Constructor ");

    }


    public ConstructorClass2(int a){
        this();
        System.out.println("Constructor with int argument");
    }

    public ConstructorClass2(String str){
this(10);
        System.out.println("Constructor with String argument");

    }

    public static void main(String[] args) {
        ConstructorClass2 object = new ConstructorClass2("Hello");

    }


    public void method1(){

       // ConstructorClass2(); cannot be called in regular method
    }

}
