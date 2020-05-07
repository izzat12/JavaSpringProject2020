package day35_Static;

import java.util.Scanner;

public class staticPratice {

    // when to use static variable instead instance

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        //Scanner scan = new Scanner(System.in);
        System.out.println("Enter number 1");
        int number1 = scan.nextInt();
        System.out.println("Enter number 2");
        int number2 = scan.nextInt();

        System.out.println("sum is: "+(number1+number2));


    }

    public void method1(){

        //Scanner scan = new Scanner(System.in);
        System.out.println("Enter number 1");
        int number1 = scan.nextInt();
        System.out.println("Enter number 2");
        int number2 = scan.nextInt();

        System.out.println("Multiplication: "+(number1*number2));

    }

}
