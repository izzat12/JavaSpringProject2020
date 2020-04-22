package day12_JavaRecap;

import java.util.Scanner;
public class Scanner_Next {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //     String str = input.next();   // only the first word
     ///////   System.out.println(str);

        // 2958 Southwestern Ave, Manchester, MD, 21102

        String fullAddress = "";
        System.out.println("Enter the number of the building: ");

        short Bnum = input.nextShort();
        fullAddress +=Bnum+ " ";

        System.out.println("Enter the Street Name: ");
        String streetName = input.next();
        fullAddress += streetName+ " ";

        System.out.println("Enter the type of the road: ");
        String roadType = input.next();
        fullAddress +=roadType+ ", ";

        System.out.println("Enter the city name, state, zipcode: ");
        String cityName = input.next();
        fullAddress+=cityName+ " ";

        String stateName = input.next();
        fullAddress+= stateName+ ", ";

        String zipcode = input.next();
        fullAddress+=zipcode;

        System.out.println("Full address is: "+fullAddress);




    }
}
