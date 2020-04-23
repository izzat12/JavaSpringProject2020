package day27_DataTime;


public class uniqueElement {

    /*

     */

    public static void main(String[] args) {

        // int and for each loop
        int[] arr = {1, 1, 2, 3, 3};


       for (int each2 : arr){
        int count = 0;

        for (int each : arr){
            if (each == each2){
                count++;
            }
        }
        if (count == 1){
            System.out.println(each2);
        }
    }
 ///////////////////////////////////////////////

        System.out.println("================================");
     int[] arr2 = {1,2,3,4,3,1};
       uniqueElements(arr2);

        System.out.println("===============================");
       double[] arr3 = {22,22,33,33,43};
       uniqueElements(arr3);

    }


      // custom method with int
    public static void uniqueElements(int[]arr){

        for (int each2 : arr) {
            int count = 0;

            for (int each : arr) {
                if (each == each2) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println(each2);
            }


        }

    }

// custom method with double
    public static void uniqueElements(double[] arr){

        for (double each2 : arr) {
            int count = 0;

            for (double each : arr) {
                if (each == each2) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println(each2);
            }


        }

    }




























}
