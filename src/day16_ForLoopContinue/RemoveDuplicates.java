package day16_ForLoopContinue;

import java.util.Scanner;

public class RemoveDuplicates {

    public static void main(String[] args) {
/*
Task:
      write a program that remove duplicate the characters, print the expected result
 */

        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        //            01235678910
        String result = "";        // we store the expected result in this variable

        for (int i = 0; i <=str.length()-1; i++) { //       if condition is true; it print "result"
/*
            if (!result.contains("" +str.charAt(i))) // if second "ab" contain then it will not print them.
            result += str.charAt(i);
        }
        */

            if (result.contains("" + str.charAt(i))) {  //      if the string result does not contain str.charAt(), -
                   //                                     then we concate it to the result , if it does we will add that to character
                continue;     // skip
            }

            result += str.charAt(i);  // only gets executed if str.charat(i)
        }

        System.out.println(result);








    }
}
