package day42_Inheritance.Task2;

public class DeviceObject {
    public static void main(String[] args) {

        TV tv1 = new TV("Samsung","E250",500,"65");
        System.out.println(tv1);

        System.out.println("===========================================");

        Phone phone1 = new Phone("Iphone","11",1300,"6.1");
        System.out.println(phone1);

    }
}
