package day20_ArraysContinue;

import java.util.Arrays;

public class Array_Utilities {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3};

        String r = Arrays.toString(arr);
        System.out.println(r);

        System.out.println(arr); //   array MUST be converted to string before we print


String names[] = { "Madina", "Izzat", "John"};
        System.out.println(Arrays.toString( names ));


        double[] number = {10, 20, 30, 40, 50};
        System.out.println(Arrays.toString(number));

        System.out.println(number [0] +1); /// addition for 10.0 will be 11.0

    }
}
