package day17_WhileLoops;

import java.util.Scanner;

/*
write a program that can calculate the two numbers based on -the user provided operators, the program will ask:
						1. enter first number
						2. enter the second number
						3. enter the math operators
								(assume that only the +, -, *, /, and % will be entered)
						then the system will give the result based on the operator
						at the end it will ask if the user want's to calculate another numbers, if user
						entered "NO" or "no", the program will stop execution, otherwise it repeats all the previous steps
								(you will need a lop that has true condition without the iterator)
 */
public class Calculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        for (int i = 0; i ==0; ){

        System.out.println("Enter first number");
        int number1 = input.nextInt();

        System.out.println("Enter second number");
        int number2 = input.nextInt();

        System.out.println("Math operator: ");
        String operator = input.next();       // +, -, *, /, %

        if (operator.equals("+")){          // Addition statement
            System.out.println("Addition is: "+(number1+number2));

        }else if (operator.equals("-")) {     // Subtract statemnt
            System.out.println("Subtraction is: "+ (number1-number2));

        }else if (operator.equals("*")){   //      Multi statement
            System.out.println("Multiplication is: "+(number1*number2));

        }else if (operator.equals("/")){   //     Divide statement
            System.out.println("Division is: "+(number1/number2));

        }else if (operator.equals("%")){ // remainder statement
            System.out.println("Remainder is: "+(number1%number2));

        }else {
            System.out.println("Invalid Operator");

        }
        System.out.println("Do you want to continue.. ");   // continue...
        String answer = input.next();

        if (answer.equalsIgnoreCase("No")){     // when you type "No" it will exit the loopd
            break;             // break method to end it:
        }


    }



    }}
