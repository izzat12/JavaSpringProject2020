package day24_MethodsContinue;


import day17_WhileLoops.PalindromeTest;

import java.util.Scanner;

public class WarmUps {
    /*
    write a methods that can return the maximum number between two numbers
			Ex: Max(10, 20) ==> 20
	2. write a method called Calculation, that passes 3 parameters: 2 numbers and one operator, and prints out the calculation
		if operator is not between [-, +, *, /, %] output should be Invalid Operator
		Ex: calculate(10, 2, '*') ==> 20;
			calculate(10, 2, '&') ==> Invalid operator
			NOTE: The method MUST take three arguments when it's called
	3. write a method that can identify if a string is palindrome
			ex: palindrom("level")  ==> true
				palindrome("Cybertek") ==> false
     */
    public static void main(String[] args) {

        int a = 2000;
        int b = 300;
        Max1(a,b);

        Calculation(10,20, '*');

        int c1 = 3000;
        int c2 = 200;
        Calculation(c1,c2,'/');

        palindrome("anna");



        ///Scanner
        while (true) {

            Scanner scan = new Scanner(System.in);

            System.out.println("Enter first number: ");
            int num1 = scan.nextInt();
            System.out.println("Enter second number");
            int num2 = scan.nextInt();

            System.out.println("Enter Operator: ");
            char operator = scan.next().charAt(0);
            Calculation(num1, num2, operator);
            System.out.println("Do you want to continue? ");
            String answer = scan.next();

            while ((!answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no"))){
                System.out.println("Invalid Entry, please re-enter");
                System.out.println("Do you want to continue");
                answer = scan.next();
            }

            if (answer.equals("No")){
                break;
            }

        }


    }

/*
    public static void Max(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number");
        int number1 = scan.nextInt();
        System.out.println("Enter second number");
        int number2 = scan.nextInt();

        if (number1>=number2){
            System.out.println("Maximum number is: "+number1);
        }else{
            System.out.println("Maximum number is: "+number2);
        }

    }

*/


    public static void Max1(int num, int num2){
        if (num>=num2){
            System.out.println("Maximum number is: "+ num);
        }else{
            System.out.println("Maximum number is: "+num2);
        }

    }



    public static void Calculation(double num1, double num2, char operator){
        switch (operator){
            case '+':
                System.out.println(num1+num2);
                break;
            case'-':
                System.out.println(num1-num2);
                break;
            case'/':
                System.out.println(num1/num2);
                break;
            case '%':
                System.out.println(num1%num2);
                break;
            case'*':
                System.out.println(num1*num2);
                break;
            default:
                System.out.println("Invalid");

        }
    }


    public static void palindrome(String str){

        str = str.toLowerCase();
        String reversed = "";

        for (int i = str.length()-1; i >=0; i--){
            reversed +=str.charAt(i);
        }
        System.out.println(str.equals(reversed));

    }


}
