package OfficeHours;

import java.util.Scanner;

public class Class {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int size = inp.nextInt();
        int[] arr = new int[size];
        for(int i=0 ;i<=size-1;i++)
        {

            arr[i]=inp.nextInt();
        }

        plus_minus(arr);
    }//end main

    public static String plus_minus(int[] arr) {

        int positive = 0;
        int negative = 0;
        int zeros = 0;

        String result = "";

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                zeros++;
            }
            if (arr[i] > 0) {
                positive++;
            }
            if(arr[i] < 0) {
                negative++;
            }
        }

        result += "positives:" + positive + ", negatives:" + negative + ", zeros:" + zeros;
        return result;
    }

}

