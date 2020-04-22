package day24_MethodsContinue;


import Resources.Library;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {

        String str = "Izzatulloh";

      String RevStr = Library.Reverse(str);

        System.out.println(RevStr);


        int[] arr = {32,54,78,31,65,12};

        Library.sortDesending(arr);
        System.out.println(Arrays.toString(arr));



    }
}
