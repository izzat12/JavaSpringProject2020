package day16_ForLoopContinue;

import java.util.Scanner;

public class PalindromeTest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your words");
        String word = input.nextLine();
                   String reverseWord = "";

        for (int i = word.length()-1; i >=0; i-- ){

         reverseWord +=  word.charAt(i);

        }
        // Level ==> level
        boolean palindorome = word.equalsIgnoreCase(reverseWord);
        System.out.println(palindorome);






    }
}
