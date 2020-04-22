package day26_MethodOverloading;


import java.util.Arrays;

public class MethodOverLoading2 {

    /*

    first method: print the sum

     */

    public static void main(String[] args) {

        // 10, 5
        sum2Numbers(10,6);

        //three numbers addition solution
        sum3Numbers(10,5,3);

        //four number additional solution
        sum4Numbers(20,30,5,10);

        System.out.println("=====================================");

        // sum of two numbers
        sum(20,34);

        // sum of 3 numbers
        sum(10,32,21);

        //sum of 4 numbers
        sum(10,20,30,40);

        System.out.println("=========================================");


        int[] arr1 = {3,45,6};

        char[] arr2 = {'a','b','c'};

        double[] arr3 ={2.4, 43, 43.4};

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        Arrays.sort(arr3);
               // same method name but different parameter

    }



    public static void sum2Numbers(int a, int b){
        System.out.println(a+b);
    }



    public static void sum3Numbers(int a, int b, int c){
        System.out.println(a+b+c);
    }



    public static void sum4Numbers(int a, int b, int c, int d){
        System.out.println(a+b+c+d);
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////


    public static void sum(int a, int b){

        System.out.println(a+b);

    }



    public static void sum(int b, int a, int c){

        System.out.println(a+b+c);
    }



    public static void sum(int a, int b, int c, int d){

        System.out.println(a+b+c+d);
    }





}
