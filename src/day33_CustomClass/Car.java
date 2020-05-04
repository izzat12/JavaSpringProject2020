package day33_CustomClass;

import java.time.Year;

public class Car {

    String Brand;
    String Model;
    int year;
    String color;

public void start(){
    System.out.println(Brand + " is started");
}


public void drive(){
    System.out.println(Brand + " "+ Model + " is driving on the road");
}

public void getCarInfo(){
    System.out.println(year + " " + Brand + " " + Model + " " + color);
}





    public static void main(String[] args) {

        int a = 100;   // local variable

    }
}
