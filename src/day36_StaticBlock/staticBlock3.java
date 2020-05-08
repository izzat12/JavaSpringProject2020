package day36_StaticBlock;

import day34_CustomClass.Testers;

public class staticBlock3 {

    static String name;
    static int num;

    public static void main(String[] args) {

        // ONLY execute in this main method
        name = "Izzat";
        num = 200;

        System.out.println(name);
        System.out.println(num);

    }

    static Testers tester1 = new Testers();

    static {

        name = "Izzatulloh";
        num = 1994;
        tester1.setTesterInfo("Izzatulloh",312,"Full SDET", 120000);

    }

}
