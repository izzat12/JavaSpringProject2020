package Resources;

import day42_Inheritance.AccessModifiers;

public class Inhertance2 extends AccessModifiers {

    public static void main(String[] args) {

        System.out.println(Inhertance2.publicVariable);
        System.out.println(Inhertance2.protectV);
        //System.out.println(Inhertance2.defualtV);  cannot inherted in differnt package


        Inhertance2.publicMethod();
        Inhertance2.protectedMethod();
     //   Inhertance2.defaultMethod(): cannot inherited

    }
}
