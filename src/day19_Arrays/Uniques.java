package day19_Arrays;

public class Uniques {
    public static void main(String[] args) {

        /*
        write a program that can return the unique characters from a string
         Ex:  "AABCC" ==> "B"
         */

    String str = "ABABCDD";    // C is unique
    String result = "";       // to store the unique characters


    for (int j = 0; j<= str.length()-1; j++){
        int count = 0;      //    to count on unique characters

        for (int i = 0; i <=str.length()-1; i++){
            if (str.charAt(i)==str.charAt(j)){
                count++;
            }
    }

        if (count ==1){
            result += str.charAt(j);
        }

    }
        System.out.println(result);





    }
}
