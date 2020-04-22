package day10_Swotch_Scanner;
import java.util.Scanner;

public class Scanner_Practice {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number: ");
        short number1 = input.nextShort();
        System.out.println("Enter second number: ");
        short number2 = input.nextShort();

        int total = (number1+number2);
        System.out.println("The result of "+number1+ " and "+number2+ " is: "
                +total);







    }



}
