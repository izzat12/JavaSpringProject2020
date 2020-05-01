package day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionMethod {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8));

      int max = Collections.max(list);
        System.out.println(max);


        int min = Collections.min(list);
        System.out.println(min);


        System.out.println("===============================");

        /*
        1. write a program that can return the second maximum number from arraylist
                     ex: {1,2,3,4,5,6,7,8,8}
                     output: 7
        2. second minimum number from arraylist
              ex: {1,2,3,4,5,6,7,8,8}
              output: 2
         */

              ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,1,3,4,5,5,6,7));

              //second max: 6
             //second min: 2

        Integer maxNum = Collections.max(numbers);

        numbers.removeAll(Arrays.asList(maxNum));
        System.out.println(numbers);

        int secondMax = Collections.max(numbers);
        System.out.println(secondMax);

        System.out.println("===========================");


        ArrayList<Integer> numbers2 = new ArrayList<>(Arrays.asList(1,2,1,3,4,5,5,6,7));

         Integer minNum = Collections.min(numbers2);

         numbers2.removeAll(Arrays.asList(minNum));
        System.out.println(numbers2);


        int secondMin = Collections.min(numbers2);
        System.out.println(secondMin);

        System.out.println("===========================================");

//======================================================================


        ArrayList<Integer> list2 = new ArrayList<>();
                   list2.addAll(Arrays.asList(1,2,3,4,5));
                    // index                 0       4
        System.out.println(list2);

        Collections.swap(list2, 0,4);
        System.out.println(list2);

        System.out.println("=====================================");

//====================================================================


        ArrayList<String> names = new ArrayList<>();
             names.addAll(Arrays.asList("Omer","Omer","Mary","Fatih", "Omer"));

             Collections.replaceAll(names, "Omer","Irina");
        System.out.println(names);












    }
}
