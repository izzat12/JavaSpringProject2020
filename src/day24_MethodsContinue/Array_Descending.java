package day24_MethodsContinue;

import java.util.Arrays;

public class Array_Descending {
    public static void main(String[] args) {

        int[] arr1 = {1,24,10,20,23,53};

        int[] arr2 = {22,54,67,2,24,76};

        int[] arr3 = {11,33,43,63,21,76};

        arr1 = sordDescending(arr1);
        arr2 = sordDescending(arr2);
        arr3 = sordDescending(arr3);


        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));


    }


    public static int[] sordDescending(int[] arr){

        Arrays.sort(arr);
        int[] RevArr = new int[arr.length];

        /*
                       i++      j--
                RevArr[0] = arr[3];
                RevArr[1] = arr[2];
                RevArr[2] = arr[1];
                RevArr[1] = arr[0];
         */
        int j = arr.length-1;
        for (int i =0; i < arr.length; i++) {
            RevArr[i] = arr[j];
            j--;
        }
        return RevArr;
    }






}
