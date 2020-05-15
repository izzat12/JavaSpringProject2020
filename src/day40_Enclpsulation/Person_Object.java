package day40_Enclpsulation;

public class Person_Object {

    public static void main(String[] args) {

        Person izzat = new Person("izzat");
        System.out.println(izzat.name);
        //System.out.println(izzat.SSN);

        izzat.setSSN(21422112);
        izzat.setID(66655);
        System.out.println("izzat's SSN "+izzat.getSSN());
        System.out.println("izzat's ID: "+izzat.getSSN());

    }






}
