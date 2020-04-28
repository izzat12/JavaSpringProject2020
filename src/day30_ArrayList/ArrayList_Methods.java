package day30_ArrayList;

import java.util.ArrayList;

public class ArrayList_Methods {
    public static void main(String[] args) {

        ArrayList<Integer>list1 = new ArrayList<>();
                    list1.add(5);
                    list1.add(7);
                    list1.add(8);

                    list1.add(1, 6);

                    list1.set(3, 9);

        System.out.println(list1);


        int[] arr = {1, 2, 3, 4};        //{1,2,3,4,5}
        arr[3] = 5;
        System.out.println("==============================");
//==================================================================

        //set();

        ArrayList<String>list2 = new ArrayList<>();
                        list2.add("A");   //0
                        list2.add("B");    //1
                        list2.add(1, "C");     //2 {A, C, B,}
                        list2.add(1, "D");       // {A, D, C, B}

                      list2.set(3,"F");  // {A, D, C, F}
                      list2.set(2, "E"); // {A, D, E, F}

        System.out.println(list2);
        System.out.println("=================================");
//====================================================================

        //remove();

        ArrayList<Integer>list3 = new ArrayList<>();
        list3.add(1);    //  0
        list3.add(2);   //   1
        list3.add(3);  //    2
        list3.add(4); //     3

        Integer a = 1;     // object will be removed
        list3.remove(a);  // {2, 3, 4}

        System.out.println(list3);

        System.out.println("=======================");
//========================================================================

        //remove();
        ArrayList<Integer>list4 = new ArrayList<>();
                list4.add(10);     //0======\\
                list4.add(20);    //1========\\
                list4.add(30);   //2==========\\
                list4.add(40);  //3 ========== \\

       // list1.remove(1);

        Integer a2 = 50;
        boolean r1 = list4.remove(a2);

        System.out.println(list4);
        System.out.println(r1);





    }
}
