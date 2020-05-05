package day33_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class catObject {
    public static void main(String[] args) {



    Cat cat1 = new Cat();
        cat1.setCatInfo("Siemes", "White", 2, "Sasha");
        System.out.println(cat1);

//====================================================
        System.out.println("==============================");

        Cat cat2 = new Cat();
        cat2.setCatInfo("Birman", "Black and White", 1, "Jermy");
        System.out.println(cat2);


        Cat cat3 = new Cat();
        cat3.setCatInfo("Scotish", "Grey", 3, "Terry");
        System.out.println(cat3);





            System.out.println("=============================");
        cat1.sleep();
        cat2.sleep();
        cat3.sleep();

        System.out.println("===============================");

        cat1.eat("cat treats");
        cat2.eat("fish");
        cat3.eat("sish kabab");

        System.out.println("================================");

        cat1.drink("water");
        cat2.drink("milk");
        cat3.drink("coffee");

}}
