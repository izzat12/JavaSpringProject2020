package day22_Arrays_Loops;

import java.util.Arrays;

public class nested_ForEach {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};

        for (int each : arr){
            System.out.print(each+ " ");
        }

        System.out.println();
        System.out.println("======================");

        int[][] arr2D = { {1,2,3}, {4,5,6} };

        for (int[] each1Darr : arr2D){

            for (int eachElement : each1Darr){
                System.out.print(eachElement + " ");
            }

        }
        System.out.println();
        System.out.println("=======================");


        char[][] ch2D = { { 'A', 'B'}, {'C', 'D', 'E'} };
        //Index                0              1

        for (char[] each1Darr : ch2D) {
            for (char eacElement : each1Darr) {
                System.out.println(eacElement);
            }

        }


    }
}
