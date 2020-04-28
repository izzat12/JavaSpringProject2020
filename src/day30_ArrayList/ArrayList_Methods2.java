package day30_ArrayList;

import java.util.ArrayList;

public class ArrayList_Methods2 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
                 list.add("A");
                 list.add("B");
                 list.add("C");
                 list.add("D");

        String str = "Z";
       boolean s1 = list.remove(str);

        System.out.println(list);
        System.out.println(s1);

        System.out.println("====================================");
//=====================================================================

     ArrayList<Integer> list2 = new ArrayList<>();

             list2.add(1);     //0
             list2.add(1);    //1
             list2.add(2);   //2
             list2.add(3);  //3

       int number = list2.indexOf(1);  //only take object
               //Integer = int  ==> AutoBoxing
        System.out.println(number);

        int number2 = list2.indexOf(100);  // unmatching will be given -1
        System.out.println(number2);


        int number3 = list2.indexOf(2);    //3
        System.out.println(number3);

    }
}
