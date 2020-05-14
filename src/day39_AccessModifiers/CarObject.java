package day39_AccessModifiers;

public class CarObject {

    public static void main(String[] args) {
        //new Constructor

      Car car1 = new Car("Toyota");
        System.out.println(car1);

        System.out.println("==============================");

        Car car2 = new Car("BMW","X4");
        System.out.println(car2);

        System.out.println("===============================");

        Car car3 = new Car("Honda", "Civic", 2020);
        System.out.println(car3);

        System.out.println("================================");

        Car car4 = new Car("Toyota","Camry", 2020,25000);
        System.out.println(car4);

    }
}
