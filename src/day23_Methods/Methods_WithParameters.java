package day23_Methods;

import java.util.Scanner;

public class Methods_WithParameters {

    /*
    write a program that under-21 is not eligible to buy alcohol
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age");
        byte age = scan.nextByte();


        EligibleToBuy(age);

    }
    public static void EligibleToBuy(byte age){
        if ( age >= 21 ){
            System.out.println("Eligible to buy alcohol");
        }else{
            System.out.println("You are not eligible to buy alcohol");
        }

    }


}
