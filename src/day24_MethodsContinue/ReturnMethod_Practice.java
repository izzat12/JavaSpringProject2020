package day24_MethodsContinue;

import java.util.Arrays;

public class ReturnMethod_Practice {
    public static void main(String[] args) {

        int[] arr = {4,76,2,6,8,3};
        int max = maxNumber(arr);
        System.out.println("Maximum number: " +max);


        int min = minNumber(arr);
        System.out.println("Minimum number: " +min);


    }


    /*
          create a function that can return the maximum number from any given array
                                            the minimum number from any given array

     */
    public static int maxNumber(int[] arr){
        Arrays.sort(arr); // ascending order
        return arr[arr.length-1];
    }



    public static int minNumber(int[] arr){
        Arrays.sort(arr);

        return arr[0];
    }



}


