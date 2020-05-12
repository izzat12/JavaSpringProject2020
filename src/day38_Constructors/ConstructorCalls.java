package day38_Constructors;

public class ConstructorCalls {

    public ConstructorCalls(){  // you can call any method to constructor method
        method1();
        method2();

    }

    public static void method1(){
     //   method2();   gives compile error because static ONLY accepts static

    }

    public void method2(){

        method1();
    }


}
