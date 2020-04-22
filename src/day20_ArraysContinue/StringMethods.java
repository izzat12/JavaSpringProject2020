package day20_ArraysContinue;

import java.lang.reflect.Array;
import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {

        String name = "Izzatulloh";
        char [] character = name.toCharArray();

        System.out.println(Arrays.toString(character));
/////////////////////////////////////////////////////////////

        String str1 = "Cybertek School";
        String str2 = "School Cybertek";

        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();

      Arrays.sort(ch1);
      Arrays.sort(ch2);

        boolean euqalStr = Arrays.equals(ch1, ch2);

        System.out.println(euqalStr); // str1 & str2 are build out of same characters



    }
}
