package day_Unary_ShorthandOperators;

public class Divisibility {

    public static void main(String[] args) {

        /*
        Divisibility, write a program that can check if a number is evenly divisible by 2, 3, 5

         */

      int number = 65;
      boolean divisiblyBy2 = number % 2 == 0;
                              //the number can be divided by 2 without any remainder
        boolean divideBy3 = number % 3 ==0;
                     // the number can be divided by 3 without any remainder
        boolean divideBy5 = number % 5 ==0;
                           // this number can be divided by 5 without any remainder

        String result1 = number + " is divisible by 2 " + divisiblyBy2;      //concatention
        String result2 = number + " is divisible by 3 " + divideBy3;
        String result3 = number + " is divisible by 5 " + divideBy5;

      //  System.out.println(result1);
        //System.out.println(result2);
        //System.out.println(result3);

        System.out.println(result1 + "\n" +result2 +"\n" +result3);




    }


}
