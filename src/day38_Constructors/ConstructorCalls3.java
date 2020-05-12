package day38_Constructors;

public class ConstructorCalls3 {


    public ConstructorCalls3(){

        this(8); //INT argument
        System.out.println("Default");
    }


    public ConstructorCalls3(int a){

        System.out.println("INT argument");


    }

    public static void main(String[] args) {

        new ConstructorCalls3();
    }


    public void method1(){
        //this();
    }

}
