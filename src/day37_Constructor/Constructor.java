package day37_Constructor;

public class Constructor {

   // public method(){ }    // constructor name MUST be same with class name...

    public Constructor(int a){

        System.out.println("Constructor with parameter of int");

    }



    public static void main(String[] args) {

       // Constructor object = new Constructor();  Object MUST be created with existing constructor

        Constructor object2 = new Constructor(10);


    }
}
