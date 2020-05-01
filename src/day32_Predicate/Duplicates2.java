package day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Duplicates2 {

    /*
    write a program that can return the duplicated values from an ArrayList of String
		Ex:
			list: {"A", "B", "A", "C", "D"};
			output: ["A"]
			list: {"A", "B", "B", "C", "D", "D"};
			output: ["A", "C"]
     */

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.addAll(Arrays.asList("A", "B", "B", "C", "D", "D"));

        ArrayList<String> result = new ArrayList<>();

/*
        for (String each : list) {

            int count = Collections.frequency(list, each);

            if (count > 1) {
                if (result.contains(each)){
                    continue;
                }
                result.add(each);
            }
        }

 */


for (int i = 0; i < list.size(); i ++){

    int count = Collections.frequency(list, list.get(i));

    if (count > 1 && !result.contains(list.get(i))){
        result.add(list.get(i));
    }

}
        System.out.println(result);



    }

}
