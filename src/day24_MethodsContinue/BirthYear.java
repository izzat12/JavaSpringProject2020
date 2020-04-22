package day24_MethodsContinue;

import java.util.Scanner;

public class BirthYear {
    public static void main(String[] args) {

        short a = 2002;
        Age((short) 1969);

        printHelloCyber();


    }


    public static void Age(short birthYear){ //2000

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the current year");
     int currentYear = input.nextInt();
     int age = currentYear - birthYear;

     if (age > 0 && birthYear >1900){

         System.out.println(age);

     }else{

         System.out.println("Invalid birth year");

     }

    }


    public static void printHello(){
        System.out.println("Hello");
    }


    public static void printCybertek(){
        System.out.println("Cybertek");
    }


    public static void printHelloCyber(){
        printHello();
        printCybertek();
    }

}
