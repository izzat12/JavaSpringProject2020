package day21_MultiDimensionalArrays;

public class ArrayNumber {
    public static void main(String[] args) {
       /*
        1. write a program that can return the average number from an array of integers
            ex:
                [1,2,3]
                average: 2
                [10, 15, 5, 6]
                average: 9
                [4, 5, 6, 7, 8, 10, 20, 30, 0]
                average: 10

        */

   int[] arr = {10, 20, 30, 40, 50, 60, 70, 50, 40, 25};

   int length = arr.length;     //    total number of the elements
   int sum = 0;

   for (int i = 0; i <= length-1; i++){

       int eachNum = arr[i];
       sum += eachNum;
   }

        System.out.println(sum);

        System.out.println(sum/(double)length);
//////////////////////////////////////////////////

        int[] arr2 = {1, 2, 2};

        System.out.println(5/(double)3);


    }
}
