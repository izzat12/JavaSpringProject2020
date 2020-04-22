package day20_ArraysContinue;

public class Array_Size {
    public static void main(String[] args) {

        int [] arr1 = {1, 2, 3};
         //            0  1  2
      // System.out.println(arr1[100]); //       array's size is fixed...


        int[] num = new int[2];         //  {0, 0}

        num[0] = 10;
        num[1] = 20;
       // num[2] = 30;

        System.out.println( num[0]);     //  10
        System.out.println(num[1]);     //   20

        num = new int [3];

        System.out.println( num[0]);
        System.out.println(num[1]);

    }
}
