package day17_WhileLoops;

import java.util.Scanner;

/*
write a program that ask user to enter username and password then should print logged in otherwise re-enter them
user: izzat
pass: izzat123
 */
public class Credentials {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter username");
        String userName = input.next();

        System.out.println("Enter Password");
        String password = input.next();

        boolean valid = (userName.equals("izzat")&& password.equals("izzat123"));   // validating new username and password

        int count = 1;
        while (!valid) {
            System.out.println("Please re-enter your credentials");
            System.out.println("Enter Username");
            userName = input.next();

            System.out.println("Enter password");
            password = input.next();

            valid = (userName.equals("izzat") && password.equals("izzat123"));// true and validating new

            count++;
            if (count == 3 && !valid) {      // already have onlu three attempts and credentials are still incorrect
                System.out.println("Your account is locked");
                break;
            }
        }

        if(valid) {        // credentials are correct
    System.out.println("Logged in");
}







    }
}
