package day31_BulkOperations;

import java.util.ArrayList;
import java.util.Arrays;

public class removeDuplicates {
    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>();
                list1.addAll(Arrays.asList(1,1,2,3,4,3,5,3,5,4,7,6,4,2,7,5));
                //expected result --> 1,2,3,4

        ArrayList<Integer> result = new ArrayList<>();

        for (Integer each : list1) { //each: 1,1,2,3,4,3
            if (!result.contains(each)) {


                result.add(each);
            }
        }
        System.out.println(result);

        System.out.println("============================================");

        /*
        write a progam that can remove duplicates from an array of integer

         */

        Integer[] arr1 = {1,2,1,3,2,3,4,5,5,4};

        ArrayList<Integer> nonDuplicates = new ArrayList<>();

        for (int i =0; i < arr1.length; i++){
            if (!nonDuplicates.contains(arr1[i]));{
                nonDuplicates.add(arr1[i]);
            }
        }
        System.out.println(nonDuplicates);
    }
}
