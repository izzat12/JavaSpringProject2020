package day19_Arrays;

public class Frequency {
    public static void main(String[] args) {
       /*
        write a program that can return the frequency of the characters ina string
        Ex: "AABCBCA" ==> "A3B2C2"
        */

       String str = "AABCC";
       String result = "";

       String nonDuplicates = "";

        for (int i =0; i <= str.length()-1; i++){
            if (!nonDuplicates.contains("" +str.charAt(i))){
                nonDuplicates +=str.charAt(i);
            }
        }



        // nonDup = "ABC        // str = "AABCC             //    result = "A2B1C2"

        for (int j = 0; j<=nonDuplicates.length()-1; j++) {
            nonDuplicates.charAt(j);
            char ch = nonDuplicates.charAt(j);

            int count = 0;          // count the total number of occurence of each character from STR
            for (int i = 0; i <= str.length() - 1; i++) {
                if (str.charAt(i) == ch) {
                    count++;
                }
            }
            result +=   ""+ ch  + count;
        }

        System.out.println(result);



    }
}
