package day12_JavaRecap;
import java.util.Scanner;

public class Scanner_NextLine_Practice {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        /// 115 Charguer Road, Reisterstown, Maryland, 21136
        //fullAddress: street number, street name, City, State, zipcode

        System.out.println("Street number: ");
        int stNumber = input.nextInt(); ///115
       // System.out.println("Street number is: "+stNumber);

        input.nextLine();                 //used for taking out the enter from the scanner....

        System.out.println("Street name: ");
        String streetName = input.nextLine();        // Charguer Road
        //System.out.println("Street name is: "+streetName);

        System.out.println("Enter the zip code: ");
        int zipCode = input.nextInt();       //21136
        input.nextLine();
       // System.out.println("Zip code is: " +zipCode);

        System.out.println("Enter the City and State name: ");
        String cityState = input.nextLine();

        String fullAddress = stNumber+ " "+streetName+ ", "+cityState+ " "+ zipCode;

        System.out.println(fullAddress);

        input.close();








    }

}
