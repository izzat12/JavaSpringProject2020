package day26_MethodOverloading;

public class Frequency {

    /*
    1. write a return method called frequency that accepts two parameters: string str and char ch,
		the method returns the frequency of the ch from the str as an int
			Ex:
				frequency("AAA", 'A') ==>  3
				frequency("ABAB", 'B') ==> 2
			Note: MUST use Arrays and for each loop
     */
    public static void main(String[] args) {

        String str = "ABBA";
        char ch = 'A';


        // this task help to count ch value occur in str
      char[] arr =  str.toCharArray();

      int count =0; // will be 1
      for (char each : arr){ // executes 3 times. each: A,B,B
          if (each==ch){ // if each is equal to chart then count will be one
              count++;
          }
      }

        System.out.println(count);
//////////////////////////////////////////////////////////////

        String str2 = "ABABAABAQDDDAFGGAS";  //
        char ch2 = 'B'; // how many time ch2 occur from str2

      int result =  frequency(str2, ch2);

        System.out.println(result);



    }




    public static int frequency (String str, char ch){

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
