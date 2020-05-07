package day35_Static;

public class staticVariable {

    int a2 = 100;         //instance variable

    static int a3 = 300;      //

    public static void main(String[] args) {

        int a1 = 100;  //local variable


        staticVariable object1 = new staticVariable();
        object1.a2 = 100;


        staticVariable object2 = new staticVariable();
        object2.a2 = 200;


        System.out.println(object1.a2);
        System.out.println(object2.a2);

    }
}
