package day31_BulkOperations;

import java.util.ArrayList;
import java.util.Arrays;

public class Bulk_addAll {
    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>();
         /*
              list1.addAll(Arrays.asList(30,20,40,50,45,35,200));

               int[] arr1 = {30, 20, 40, 50, 45, 35, 200}; --> arraylist does not support primitive, only NON primitive
          */

         Integer[] arr1 = {30, 20, 40, 50, 45, 35, 200};
        list1.addAll(Arrays.asList(arr1));
        System.out.println(list1);

        System.out.println("========================");
//==================================================================


        String[] names = {"Izzat", "Serhat", "John", "Madina", "Sada"};

     //   names[5] = "Osman"; // index 5 is out

        System.out.println(Arrays.toString(names));

        ArrayList<String> nameList = new ArrayList<>();

               nameList.addAll(Arrays.asList(names) );
                       //return is collectionType
        nameList.add("osman");
        nameList.remove("Izzat");

        System.out.println(nameList);

        System.out.println("======================================");

//=======================================================================

        Integer[] numbers = {1,2,3,4,4,5,6,7,8,9};

        ArrayList<Integer> numList = new ArrayList<>(Arrays.asList(numbers));
        System.out.println(numList);





    }
}
