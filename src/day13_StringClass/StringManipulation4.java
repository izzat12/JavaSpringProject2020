package day13_StringClass;

/*
    task: write a program that askes user first and last names, then prints the initials.
    input:
     izZaTuLLoh pAtIdInOv

output:
       Izzatulloh
       Patidinov
 */

import java.util.Scanner;

public class StringManipulation4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter full name");
        String fullName = input.nextLine();      // cybertek school

        String firstName = fullName.substring(0,fullName.indexOf(" ") );
        String lastName = fullName.substring(fullName.indexOf(" ") +1 );

        firstName = fullName.substring(0,1).toUpperCase()+firstName.substring(1).toLowerCase();
        lastName = lastName.substring(0,1).toUpperCase() + lastName.substring(1).toLowerCase();


        System.out.println("First name is "+firstName);
        System.out.println("Last name is "+lastName);



        ///     task: write a program that askes user first and last names, then prints the initials.




    }
}
