package day14_StringContinue;

import java.util.Scanner;

/*
Write a Java method to display the middle character of a string
		a) If the length of the string is even there will be two middle characters.
		b) If the length of the string is odd there will be one middle character.

		                 IF statement will be use and Scanner
				Input :
					elephant
				Output:
					The middle character in the string: ph
 */
public class wormUp3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter word");
        String word = input.next();     // Izzatulloh
         //                                0123456789

        String middleCharacter = "";            // to store the middle characters at the end...

        int totalCharacter = word.length();      // 5 % 2  =
        int middleNumber = totalCharacter/2;

        if(totalCharacter % 2 !=0){             //odd number for now
        //    middleCharacter += word.charAt(middleNumber);
            middleCharacter = middleCharacter + word.charAt(middleNumber);

        }else {                //   otherwise it is even number

        //    middleCharacter = middleCharacter + word.charAt(middleNumber -1) + word.charAt(middleNumber);

          middleCharacter += word.charAt(middleNumber -1)+""+word.charAt(middleNumber);

                      // any thing we added to a string, it will return it as string

        }

        System.out.println("The middle character in the string: " +middleCharacter);







    }

}
