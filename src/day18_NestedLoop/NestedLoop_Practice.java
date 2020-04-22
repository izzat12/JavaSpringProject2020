package day18_NestedLoop;

import java.util.Scanner;

public class NestedLoop_Practice {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true) {

            System.out.println("Enter two numbers");
            int number1 = input.nextInt();
            int number2 = input.nextInt();

            System.out.println("Addition of two number: " + (number1 + number2));
            System.out.println("Do you want to continue...");

            String answer = input.next();

            if (!(answer.equalsIgnoreCase("Yes") ||answer.equalsIgnoreCase("No"))){
                System.out.println("Invalid Entry, please re-enter, do you want to continue");
                answer = input.next();
            }

            // what if user enter "No"
            if (answer.equalsIgnoreCase("No")){
                System.out.println("Thank you for using the calculator");
                break;
            }

        }



        }

    }

