package day34_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class ObjectMemory {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10,20,30,40));

        ArrayList<Integer> list2 = list;

        list.remove(2);
        System.out.println(list);
        System.out.println(list2);

        System.out.println("======================================");

        String str1 = new String ("cybertek");
        String str2 = str1;

        str1.toUpperCase();        // you cannot change it

        System.out.println(str1);
        System.out.println(str1);



    }
}
