package day35_Static;

public class staticVariable2 {

    int insVariable;     // every single object of the class its own copy

    static int staticVariable; // there is only one copy os static shared by all objects

    public static void main(String[] args) {

        staticVariable2 object3 = new staticVariable2();
        object3.insVariable = 300;
        object3.staticVariable = 4400;



        staticVariable2 object2 = new staticVariable2();


        System.out.println(object3.insVariable);
        System.out.println(object2.insVariable);

        System.out.println();

        System.out.println(object2.staticVariable);
        System.out.println(object3.staticVariable);
    }

}
