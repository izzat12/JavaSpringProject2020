package day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class moveZeros2 {

    /*
    Write a program that can move all the zeros to  last indexes of ArrayList
		Ex:
			list:  {1,0,2,0,3,0,4,0};
			output: [1, 2, 3, 4, 0, 0, 0, 0]
			DO NOT USE SORT method, DO NOT declear  any extra lists

     */

    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>();
         list1.addAll(Arrays.asList(1,0,2,0,3,0,4,0));
        System.out.println(list1);

    // count of zeros
       int count = Collections.frequency(list1,0);
        System.out.println(count);


        //remove All
        list1.removeAll(Arrays.asList(0));
        System.out.println();


        //add zeros at the end;
        for (int i = 0; i <count; i++){
            list1.add(0); // if you want to move zeros at the beginning, just add one zero
        }
        System.out.println(list1);


    }
}
