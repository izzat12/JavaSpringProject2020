package day33_CustomClass;

import java.io.CharArrayReader;

public class carObjects {
    public static void main(String[] args) {

      Car car1 = new Car();

      car1.Brand = "BMW";
      car1.Model = "X5";
      car1.year = 2019;
      car1.color = "Red";


        System.out.println(car1.Brand);  // instance variable are object variable we can call them through the object name
        System.out.println(car1.Model);
        System.out.println(car1.year);
        System.out.println(car1.color);

        System.out.println("=========================");

     Car car2 = new Car();

     car2.Brand = "Toyota";
     car2.Model = "Camry";
     car2.color = "Black";
     car2.year = 2017;

        System.out.println("Brand is " + car2.Brand);
        System.out.println("Model is " + car2.Model);
        System.out.println("Year is " + car2.year);
        System.out.println("Color is " + car2.color);

car2.start();
car2.drive();
car2.getCarInfo();

        System.out.println("=====================");


   Car car3 = new Car();

        car3.Brand = "Honda";
        car3.Model = "Civic";
        car3.color = "White";
        car3.year = 2020;

        car3.getCarInfo();

        System.out.println("=====================");

        Car[] cars = {car1,car2,car3};

        cars[0].getCarInfo();
        cars[1].getCarInfo();
        cars[2].getCarInfo();


        /*
                create 5 car objects
                put them in an array of cars
                use for loop to get each car info
                and for each loop to get each car info

         */


    }
}
