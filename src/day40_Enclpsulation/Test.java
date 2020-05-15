package day40_Enclpsulation;

public class Test {

    public static void main(String[] args) {

        Encapsulation object = new Encapsulation();
        //System.out.println(object.SSN); cannot able to direct to access to it

        System.out.println(object.getSSN());

       // object.SSN;
        object.setSSN(342342);

    }
}
