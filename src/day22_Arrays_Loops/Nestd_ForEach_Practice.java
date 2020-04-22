package day22_Arrays_Loops;

public class Nestd_ForEach_Practice {
    public static void main(String[] args) {

        /*
        // 1. print all even numbers ina same line
        // 2. count odd numbers ==> return the total odd number
         */

        int[][] numbers = {
                {1,2,3},
                {4,5,6,7,8,9},
                {10,11,12,13,14},
                {15,16,17,18,19,20,21}
                                          };

        int countOdd = 0;
        int sumOfOdd = 0;
        int sumOfEven = 0;

        for (int[] each1Darray : numbers){

            for (int eachElement : each1Darray){

                if (eachElement % 2 ==0){ //       even numbers

                    System.out.print(eachElement+" ");
                    sumOfEven += eachElement;

                }else{

                    sumOfOdd += eachElement;
                    countOdd++; ///                otherwise count odd number
                }

            }
        }
        System.out.println();

        System.out.println(countOdd);
        System.out.println("sum of odd: "+ sumOfOdd);
        System.out.println("sum of even: "+sumOfEven);
    }
}
