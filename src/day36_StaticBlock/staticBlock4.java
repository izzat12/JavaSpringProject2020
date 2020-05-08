package day36_StaticBlock;

import day34_CustomClass.Testers;

public class staticBlock4 {

    static String name = "Cybertek School"; // it still execute
    static Testers tester1 = new Testers();
    //tester1.setTesterInfo("Izzat",123,"SDET",120000); // it will give compile error

    int insVariable;


    static {  // designed for statics only
        /*
        // get executed as soon as the class loaded
        //designed to initialize (assign) static variable

        name = "Izzatulloh";
        */

        tester1.setTesterInfo("Izzat",123,"SDET",120000);
        tester1.setTesterInfo("john",1244,"Senior SDET",123123);


       // staticBlock4 object1 = new staticBlock4();
      //  object1.insVariable = 300;                DO NOT USE static block for initializing instance variable

    }

    public static void main(String[] args) {
        System.out.println(name);
        System.out.println(tester1);

       // System.out.println(object1.insVariable);      it will be compile error

        staticBlock4 object2 = new staticBlock4();
        System.out.println(object2.insVariable);


    }

}
