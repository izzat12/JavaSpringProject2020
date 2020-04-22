package day17_WhileLoops;

import java.util.Scanner;

/*
         ask the user to enter yes or no
         if the user enters other than yes or no, repeat the previous step
 */
public class WhileLoop_Practice {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Yes or No");
        String word = scan.next();

        boolean valid = word.equalsIgnoreCase("yes") || word.equalsIgnoreCase("no");

        while (!valid){
            System.out.println("Please re-enter");
            word = scan.next();

            if (word.equalsIgnoreCase("yes") || word.equalsIgnoreCase("no")){
                break;
            }
        }
        if (word.equalsIgnoreCase("Yes")){
            System.out.println("Entered yes");
        }
        if (word.equalsIgnoreCase("No")){
            System.out.println("Entered no");
        }


    }
}
