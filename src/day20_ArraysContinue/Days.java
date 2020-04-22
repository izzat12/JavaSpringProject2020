package day20_ArraysContinue;

import java.util.Scanner;

public class Days {
    public static void main(String[] args) {
        /*
        write a program that user enter number days
         */

        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number");
        int number = input.nextInt();

        int attempts = 1;

        while (number > 7 || number < 1){
            System.out.println("Invalid Entry, please re-enter the number");
            number = input.nextInt();
            attempts++;
            if (attempts == 3 && (number > 7 || number <=0)){
                System.out.println("Invalid number, you already have 3 attempts");
                System.exit(0);
            }
        }


        String result = days[number-1];




        System.out.println(result);

    }
}
