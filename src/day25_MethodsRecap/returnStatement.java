package day25_MethodsRecap;

public class returnStatement {

    public static void main(String[] args) {

     /*
        if (10>9){
            return;
        }
        System.out.println("Hello");
      */

     method1();
        System.out.println("Hello");

        method2();
    }


    public static void method1(){

        if (10>9){
            return;
        }

        System.out.println("Hello Cybertek");

    }


    public static void method2(){

        if (10>9){
            System.exit(0);
        }

        System.out.println("Hello Cybertek");



    }






}
