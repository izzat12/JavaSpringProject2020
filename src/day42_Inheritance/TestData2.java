package day42_Inheritance;

public class TestData2 extends AccessModifiers {

    public static void main(String[] args) {

        System.out.println(TestData2.publicVariable); //  allows
        System.out.println(TestData2.protectV);
        System.out.println(TestData2.defaultV);
       // System.out.println(TestData2.privateV)   only access to same class



        TestData2.publicMethod();
        TestData2.protectedMethod();
        TestData2.defaultMethod();
     //   TestData2.privateMethod; cannot be inherited


    }
}
