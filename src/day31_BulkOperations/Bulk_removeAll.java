package day31_BulkOperations;

import java.util.ArrayList;
import java.util.Arrays;

public class Bulk_removeAll {
    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>();
                 list1.addAll(Arrays.asList(1,2,3,4,5,6,7,1,3,5,8,8));
                  //remove duplicates from an arraylist
        /*
          Integer a = 1;

          list1.remove(a);
          list1.remove(a);
         */

       // list1.removeAll(Arrays.asList(3,1,5,8) );

        Integer[] arr = {3, 1, 5, 8};
        list1.removeAll(Arrays.asList(arr));

        System.out.println(list1);

        System.out.println("=============================================");

//=======================================================================

     // remove names ahmad
     String[] names = {"ahmad", "john", "aaron", "ahmad", "daniel"};

     ArrayList<String> list2 = new ArrayList<>(Arrays.asList(names));

        System.out.println(list2);

        list2.removeAll(Arrays.asList("ahmad"));
        System.out.println(list2);


    }
}
