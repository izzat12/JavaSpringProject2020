package day10_Swotch_Scanner;
import java.util.Scanner;
public class number_scanner {
    public static void main(String[] args) {

        /*
        write a program that user can enter three number and then print
        maximum number and minum number!
         */
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter  first number: ");
        int num1 = scan.nextInt();

        System.out.println("enter second number");
        int num2 = scan.nextInt();

        System.out.println("enter third number");
        int num3 = scan.nextInt();

        int max = (num1>num2 && num1>num3) ? num1 : (num2>=num1 && num2>=num3)?
                num2 : num3;
        System.out.println("Maximum Number is: " +max);

        int min = (num1<num2 && num1<num3) ? num1 : (num2<=num1 && num2<=num3)?
                num2 : num3;
        System.out.println("Minimum number is: "+min);




    }
}
