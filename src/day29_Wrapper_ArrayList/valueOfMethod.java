package day29_Wrapper_ArrayList;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Arrays;

public class valueOfMethod {
    public static void main(String[] args) {

        String str = "123";
        Integer a = Integer.valueOf(str);
        System.out.println(a);


        double b = Integer.valueOf(str); //unboxing
        /// double to Integer
        System.out.println(b);

//==================================================================

        String str2 = "15.5";

        double d1 = Double.valueOf(str2);
        Double d2 = Double.valueOf(str2); //unboxing
        double d3 = Double.parseDouble(str2); // none of them


        System.out.println(d1); // primitive
        System.out.println(d2); //wrapper class: valueOf
        System.out.println(d3); //parse

        System.out.println(d2 ==d3);
        System.out.println("====================================");

//==================================================================

        int z1 = 200;
        //Long l1 = z1; //does not accept any other primitive except for long

        Short sh1 = 3000;
        int z2 = sh1;

//=================================================================

       String r1 = "True";
       Boolean bol1 = Boolean.valueOf(r1); //Boolean, true

        boolean bol2 = Boolean.valueOf(r1);
        // boolean = Boolean ==> unboxing

        System.out.println(bol1);
        System.out.println(bol2);
        System.out.println("==============================================");

//===================================================================

        // int max number
        int maxNum = Integer.MAX_VALUE;
        System.out.println(maxNum);

        //double maximim number
        double maxnum2 = Double.MAX_VALUE;
        System.out.println(maxnum2);

        //int min number
        int minNum = Integer.MIN_VALUE;
        System.out.println(minNum);

        //byte max number'
        byte maxNum3 = Byte.MAX_VALUE;
        System.out.println(maxNum3);

        //byte min number
        byte minNum2 = Byte.MIN_VALUE;
        System.out.println(minNum2);

        System.out.println("=================================");

//==========================================================

     boolean[] arr = new boolean[3];
        System.out.println(Arrays.toString(arr));

        //result is null for wrapper class
        Boolean[] arr2 = new Boolean[3];
        System.out.println(Arrays.toString(arr2));

        char[] arr3 = new char[3];
        System.out.println(Arrays.toString(arr3));









    }
}
