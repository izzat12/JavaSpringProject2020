package day37_Constructor;

public class Car {

    String brand;
    String model;
    int year;
    double mileage;
    String bodyStyles;
    double price;


    public Car(String brand, String model, int year, double mileage,
               String bodyStyles,  double price){

        this.brand = brand;
        this.model = model;
        this.year = year;
        this.mileage = mileage;
        this.bodyStyles = bodyStyles;
        this.price = price;


    }

    public String toString(){

        String result = "Brand: "+brand+", Model: "+model+", Year: "+year+", Mileage: "+mileage+
                ", BodyStyles: "+bodyStyles+", prices: $"+price;

        return result;

    }


}
