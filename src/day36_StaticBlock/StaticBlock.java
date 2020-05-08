package day36_StaticBlock;

public class StaticBlock {

    static { //first executed

        System.out.println("Hello World");

    }

    public static void main(String[] args) {

        System.out.println("hello asasd"); // third executed

        //last executed
        method1();

    }

    public static void method1(){

        System.out.println("hello girls ");
    }

    static{ // second executed

        System.out.println("hello boysssssss");

    }

}
