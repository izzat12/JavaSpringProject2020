package Resources;

import day42_Inheritance.Data;

public class Inheritance extends Data {

    public static void main(String[] args) {

        System.out.println(Inheritance.publicData);
        System.out.println(Inheritance.protectedData);
       // System.out.println(Inheritance.default); cannot be visible in outside the package
    }

}
