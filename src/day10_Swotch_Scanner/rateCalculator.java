package day10_Swotch_Scanner;
import java.util.Scanner;
public class rateCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your salary: ");
        int salary = scan.nextInt();

        System.out.println("How many hours do you work in week: ");
        byte weeklyHours = scan.nextByte();

        System.out.println("How many weeks do you work in a year: ");
        byte numberOfWeeks = scan.nextByte();

        //hourlyRate =

        int hourlyRate = (salary / numberOfWeeks ) / weeklyHours;
        System.out.println("Hourly rate is: " + hourlyRate);







    }

}
