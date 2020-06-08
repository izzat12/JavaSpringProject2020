package day47_Abstraction;


class Test1{

    public Test1(){ }

    public void method1(){}

    //public abstract void method3(){}

    public static void method2(){}


    int a = 100;

    static int b = 300;

    static {
        System.out.println("static block");
    }

    {
        System.out.println("instance block");
    }

}



abstract class Test2{

    public Test2(){}

    public void method1(){}

    public static void meothd2(){}

    public abstract void method3();

    int a =100;
    static int b = 200;

    {
        System.out.println("instance block");
    }
    static {
        System.out.println("static block");
    }

}

public class Abstract_VS_NonAbstract {


}
