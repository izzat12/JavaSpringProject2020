package day27_DataTime;

public class Find_Minimum {
    /*
    		1. write a return method that can return the minimum number from an int array

    		2. write a return method that can return the minimum number from a double array

     */
    public static void main(String[] args) {

        int[] arr = {5, 6, 7, 4};

        /// can print any minimum number
        int minimum = arr[0];
        for (int each : arr) {

            if (each < minimum) {
                minimum = each;
            }
        }
        System.out.println(minimum);
        /////////////////////////////////////////////////////////////////
        System.out.println("====================================================");


        //custom method print with int array
        int[] arr2 = {100,200,300,400,500};
        System.out.println(minNumber(arr2));
        System.out.println("=====================================================");

        ///double array
        double[] arr3 = {32.2,32.32,43.23,32.43,21.1};
        System.out.println(minNumber(arr3));



    }


    // with custom method, we can print minimum number
    public static int minNumber(int[] arr){

        int minimum = arr[0];
        for (int each : arr) {

            if (each < minimum) {
                minimum = each;
            }
        }

        return minimum;

    }


         // with double, to print minimum number
    public static double minNumber(double[] arr){

        double minimum = arr[0];
        for (double each : arr) {

            if (each < minimum) {
                minimum = each;
            }
        }
        return minimum;
    }


}
