package day36_StaticBlock;

import day34_CustomClass.Testers;

public class StaticBlock2 {

    static int a ;
    static int b;

    static Testers tester1 = new Testers();



    public static void main(String[] args) {

        System.out.println(tester1);
    }



    static {

        a=100;
        b=200;
       // c = 30;         static ONLY accepts static

        if (100 > 200){
            a =100;
        }else {
            b = 200;
        }

        tester1.setTesterInfo("Izzat",223,"Junior QA",12000);


    }


}
