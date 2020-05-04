package day33_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class carObjects2 {

    public static void main(String[] args) {

        Car car1 = new Car();
        car1.setCarInfo("Toyota","Highlander", 2020,"Blue");
        car1.getCarInfo();

//=====================================================================================

        Car car2 = new Car();
        car2.setCarInfo("BMW","X6",2020,"Black");
        car2.getCarInfo();

//=====================================================================================

        Car car3 = new Car();
        car3.setCarInfo("Honda","Civic",2020,"White");
        car3.getCarInfo();

//=====================================================================================

        System.out.println("=============================================");

        Car[] cars = {car1,car2,car3};

        for(int i = 0; i <cars.length; i++){

            cars[i].getCarInfo();
        }

        System.out.println("====================================");

        for (Car eachCar : cars){

            eachCar.getCarInfo();

        }

        System.out.println("=================================");

        System.out.println(car1);


        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,4));
        System.out.println(list1);

    }
}
