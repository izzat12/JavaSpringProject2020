package day37_Constructor;

public class InstanceBlock {

    {
        System.out.println("Instance block");

    }

    public static void main(String[] args) {

        InstanceBlock object = new InstanceBlock();
        InstanceBlock object1 = new InstanceBlock();


    }


}
