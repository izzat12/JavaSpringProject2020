package day20_ArraysContinue;

import java.util.Arrays;

public class Arrays_Sorts {
    public static void main(String[] args) {

        int[] arr1 = {111, 34234, 3,434, 3234 ,234,234,234,234,23,423,42,34,234,234,234,234,234,23,4234, 23,4,234,234,234,234,2};
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));

        System.out.println("First min number is: " + arr1[0]);
        System.out.println("Second min number is: " + arr1[1]);
        System.out.println("First max number is: "+arr1[arr1.length -1]);
        System.out.println("Second max number is: " + arr1[arr1.length -2]);

/////////////////////////////////////////////////////////////////////////////////

        char[] ch = {'Z', 'D', 'W', 'Y', 'A', 'B', 'E', 'D'};
        Arrays.sort(ch);
        System.out.println(Arrays.toString(ch));

 ////////////////////////////////////////////////////////////////////////////////

        String[] names = { "Izzat", "Ali", "Adil", "John", "Bek", "Sherali", "David"};

        Arrays.sort(names);
        System.out.println(Arrays.toString(names));

//////////////////////////////////////////////////////////////////////////////////

        int[] arr = {3, 1, 4, -1, 100, -100, 200, 155};
        Arrays.sort(arr);

        int[] arrDesc = new int[arr.length];

        System.out.println(Arrays.toString(arr));


        int j =0;

        for (int i = arr.length-1; i >=0; i--){
            arrDesc[j] = arr[i];

            j++;
        }

        System.out.println(Arrays.toString(arrDesc));





    }
}
