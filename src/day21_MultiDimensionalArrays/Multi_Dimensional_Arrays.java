package day21_MultiDimensionalArrays;

import java.util.Arrays;

public class Multi_Dimensional_Arrays {
    public static void main(String[] args) {

        // multi arrays

        int[] arr = {1, 2, 3};

        int[][] arr2D = { {1,2,3}, {4, 5, 6} };
         //                 0          1

        System.out.println(arr2D.length);
        int[] arr1D = arr2D[1];  // print 0 value

        System.out.println(Arrays.toString(arr1D));

        int number1 = arr2D[1][2];
        System.out.println(number1);

        char[][] ch2D = { { 'A', 'B' }, {'D', 'C', 'E', 'F'}, {'G', 'H', 'I'} };
        // index             0                  1                    2

       char letter = ch2D[1][0];
        System.out.println(letter);

        char[] ch = ch2D[2];
        System.out.println(ch);

//            column              0    1    2       0   1   2       0    1    2
        String[][] str2Ds = {  {"A", "B", "C"},  {"D","E","F"},  {"J", "H", "I"}  };
        // index                      0                1                2

        String r1 = str2Ds[2][1];

        System.out.println(r1);



    }
}
