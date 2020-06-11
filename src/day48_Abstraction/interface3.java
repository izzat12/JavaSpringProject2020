package day48_Abstraction;

public abstract class interface3 {
    public abstract void method1();

    public abstract void method2();



    static final int num = 100; // by default public

    static int num2 = 300; // by default: public static final



    public static void main(String[] args) {

        interface3.method3();

        System.out.println(num2);

    }



    static void method3(){



    }



}
