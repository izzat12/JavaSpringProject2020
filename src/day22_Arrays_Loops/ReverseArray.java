package day22_Arrays_Loops;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};

        for (int i = arr.length-1; i >= 0; i--){
            int eachNumber = arr[i];
            System.out.print(eachNumber+ " ");

        }
        System.out.println();
        System.out.println("==================================v ====");

        int[] RevArray = new int[arr.length];
/*
        RevArray[0] = arr[4];
        RevArray[1] = arr[3];
        RevArray[2] = arr[2];
        RevArray[3] = arr[1];
        RevArray[4] = arr[0];
*/
       int j = arr.length-1;
        for (int i =0; i < arr.length; i++){
            RevArray[i] = arr[j];
            j--;
        }
        System.out.println(Arrays.toString(RevArray));

        System.out.println("===============================================");
    }
}
