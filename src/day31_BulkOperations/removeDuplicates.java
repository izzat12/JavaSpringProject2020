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

    }
}
