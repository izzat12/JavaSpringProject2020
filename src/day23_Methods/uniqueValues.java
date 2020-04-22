package day23_Methods;

public class uniqueValues {
    public static void main(String[] args) {
/*
        1.  Write a program that can print out the unique values from a String Array
        Ex:
        if arr -> {"A", "A", "B", "C", "C"}
        output: B
        if arr -> {"A", "B", "B", "C"}
        output:  A
                C
                         MUST use for each loop
*/

        String[] arr = {"Izzat", "Izzat", "Bek", "John", "John",}; /// B

        //        solution 1:
        for (String eachElement : arr) {
            int count1 = 0;

            for (int i = 0; i < arr.length; i++) {

                if (arr[i].equals(eachElement)) {

                    count1++;
                }
            }
            if (count1 == 1) {

                System.out.println(eachElement);
            }
        }

        System.out.println("==============================================");

        //solution 2:
        for (String each2 : arr) {
            int count = 0;

            for (String each : arr) {
                if (each.equals(each2)) {
                    count++;
                }
            }

            if (count == 1) { // if the character is equal to one then
                System.out.println(each2);
            }
        }

        System.out.println("===============================");

        // solution 3:
        for (int j = 0; j < arr.length; j++) {
            int count3 = 0;

            for (int i = 0; i < arr.length; i++) {

                if (arr[i].equals(arr[j])) {

                    count3++;
                }
            }
            if (count3 == 1) {

                System.out.println(arr[j]);
            }
        }


    }
}
