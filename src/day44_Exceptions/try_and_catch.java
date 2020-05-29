package day44_Exceptions;

import java.util.ArrayList;
import java.util.Arrays;

public class try_and_catch {

    public static void main(String[] args) {
        System.out.println("Test Started");
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));

        try {
            System.out.println(list.get(10));


        }catch (IndexOutOfBoundsException e){
            System.out.println("something went wrong");
        }
        System.out.println("Test Completed");
    }
}
