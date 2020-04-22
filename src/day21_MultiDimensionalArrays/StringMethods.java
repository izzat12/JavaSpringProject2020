package day21_MultiDimensionalArrays;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {

        String name = "Java";

        char[] chars = name.toCharArray();

        System.out.println(chars[0]);
        System.out.println(chars[2]);

//////////////////////////////////////////////////////////////

        // split(value);

        String str = "I like Java";

        String[] arr = str.split(" ");
        System.out.println(Arrays.toString(arr));

        /*
        reverse sentence: day great is today
         */

        String sentence = "Today is great day";

        String[] words = sentence.split(" ");
        System.out.println(Arrays.toString(words));
        String result = "";

        for (int i = words.length-1; i >=0; i--){
            String eachWords = words[i];
         //   System.out.println(eachWords+ " ");
            result += eachWords+ " ";
        }
        System.out.println(result);


        String str2 = "ABCD";
        String arr2[] = str2.split("");
        System.out.println(Arrays.toString(arr2));

    }
}
