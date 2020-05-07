package day35_Static;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class staticMethods {

    int a = 100;
    static int b = 200;


    public static void main(String[] args) {

       // System.out.println(a); static accepts static

        staticMethods obect = new staticMethods();

        System.out.println(obect.a);

        System.out.println("=============================");

/// it will be compile because static call through static

        System.out.println(b);
        System.out.println(staticMethods.b);
        System.out.println(obect.b);

        System.out.println("==================================");
    }


    public void method(){

        System.out.println(a);
        System.out.println(b);
    }


}
