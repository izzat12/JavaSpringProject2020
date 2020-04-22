package day22_Arrays_Loops;

import java.util.Arrays;

public class Descending {
    public static void main(String[] args) {

        /*
        Task:
           write a program that sort the array in descending order

         */

        int[] arr = {10, 78, -1, 500, 70};

        // Lowest number to highest number

        Arrays.sort(arr); //    sorts in ascending
        System.out.println(Arrays.toString(arr));
//////////////////////////////////////////////////

        /// Highest number to lowest number
        int[] RevArra = new int [arr.length];

        int j = arr.length-1;
        for (int i =0; i < arr.length; i++){
            RevArra[i] = arr[j];
            j--;
        }
        System.out.println(Arrays.toString(RevArra));

    }
}
