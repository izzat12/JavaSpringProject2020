package day45_Exceptions;

public class ThrowKeyword {

    public static void method1() throws Exception {
        System.out.println("Love you");
        Thread.sleep(3000);
        System.out.println("Nah i lied");

    }


    public static void main(String[] args) throws Exception {

        method1();
    }
}
