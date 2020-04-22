package day22_Arrays_Loops;

public class Nested_Loops2 {
    public static void main(String[] args) {

        int [][] numbers = { {5, 4, 3, 2, 1, 0 }, {6}, {9, 8, 7}};
        //        index          0       1           2

        /*
        numbers[0] --> {9, 8, 7}  numbers[0][i]  --> repeated 3 times

        numbers[1] --> {6}        numbers[1][i] -->  repeated 1 time

        numbers[2] --> {5, 4, 3, 2, 1, 0}     numbers[2][i]     --> repeated 6 times
         */

        // in order to print from first index to last index number
        for (int k = 0; k < numbers.length; k ++){

            for (int i =0; i < numbers[k].length; i++){

                System.out.print(numbers[k][i] + " ");

            }
            System.out.println();
            System.out.println("===========================");

        }

        for (int k = 0; k < numbers.length; k++){
            for (int i = numbers[k].length-1; i >= 0; i-- ){

                System.out.print(numbers[k][i]+ " ");
            }
            System.out.println();
            System.out.println("===========================");

        }

        for (int k = numbers.length-1; k >=0; k--){//   k: index number of 1D arrays (reversed)

            for (int i = 0; i < numbers[k].length; i++){

                System.out.print(numbers[k] [i] + " ");

            }
        }








    }
}
