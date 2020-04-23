package day26_MethodOverloading;

public class Uniques {


    public static void main(String[] args) {

        String str = "ABBCDEE";
        String result = "";

        for (int i = 0; i < str.length(); i++){ // repeat over and over again

            int number =  Frequency(str,str.charAt(i)); // repeated one time since its in char at
            if (number == 1){
                result += str.charAt(i);
            }

        }

        System.out.println(result);
/////////////////////////////////////////////////////////

        String str2 = "Cybertek";
        String result2 = uniques(str2);

        System.out.println(result2);
    }



    public static String uniques(String str){

        String result = "";

        for (int i = 0; i < str.length(); i++){ // repeat over and over again

            int number =  Frequency(str,str.charAt(i)); // repeated one time since its in char at
            if (number == 1){
                result += str.charAt(i);
            }

        }
        return result;


    }



    public static int Frequency (String str, char ch){

        char[] arr =  str.toCharArray();

        int count =0; // will be 1
        for (char each : arr){ // executes 3 times. each: A,B,B
            if (each==ch){ // if each is equal to chart then count will be one
                count++;
            }
        }

        return count;

}



}
