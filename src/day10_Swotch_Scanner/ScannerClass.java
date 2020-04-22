package day10_Swotch_Scanner;
import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a byte number: ");
        byte number1 = input.nextByte();
        System.out.println("You have entered "+ number1);

        if(number1%2==0){
            System.out.println("is even number");
        }else {
            System.out.println("is odd number");
        }



    }

}
