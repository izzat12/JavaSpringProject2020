package day22_Arrays_Loops;

public class Count_Odd_Even {
    public static void main(String[] args) {
        /*
        Task:
         write a program that can count the even and odd number from an array of integers
                         MUST use for each loop
         */

        int[] arr = {1,2,3,4,5,6,7,8,9,10,11};

        int countOdd = 0;
        int countEven = 0;

        for (int  each : arr) {

            if (each % 2 ==0){
                countEven++;
                continue;
            }
                countOdd++;
        }

        System.out.println("Even numbers: "+ countEven);
        System.out.println("Odd numbers: "+ countOdd);

    }
}
