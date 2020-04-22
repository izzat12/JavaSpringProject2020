package day13_StringClass;
import java.sql.SQLOutput;
import java.util.Scanner;
/*
write a program for the shipping info that, the program should ask:
					building number
					Street address (Assume it has more than one word)
					city name
					state name
					zip code
					full name of the person:
			and prints the ship to info in the following format:

 */
public class shippingInfo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter building number");
        String buildingNumber = input.next();          //2958 <------

        input.nextLine();       //Enter scanner

        System.out.println("Enter the street address");
        String streetAddress = input.nextLine();

        System.out.println("Enter city name");
        String cityName = input.nextLine();

        System.out.println("Enter state name");
        String stateName = input.nextLine();

        System.out.println("Enter zip code");
        String zipCode = input.next();

        input.nextLine();

        System.out.println("Enter full name");
        String fullName = input.nextLine();

        String result = "Ship to: "+fullName+"\n\t\t "+buildingNumber+ " " +streetAddress+"\n\t\t "+cityName+", "+stateName+ " " +zipCode;
        System.out.println(result);

    }
}
