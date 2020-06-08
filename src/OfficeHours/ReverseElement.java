package OfficeHours;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import javax.imageio.stream.ImageInputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class ReverseElement {

    /*
    create a method that will accept an int array and reverse the order of elements. Return the reversed array
     */

    public static void main(String[] args) {

        int a [] = {5,2,8,1,3,9};
        System.out.println(Arrays.toString(reverse(a)));

    }

        public static int[] reverse ( int[] arr){
            //1,3, 2, 4    -->     4,2, 3, 1

            for (int i = 0; i < arr.length / 2; i++) {

                int temp = arr[i];
                arr[i] = arr[arr.length - 1 - i];
                arr[arr.length - 1 - i] = temp;
            }

            return arr;
    }


    /*
    4. Overload the method to accept an Arraylist of integers and reverse the order of the elements
    return the reversed Arraylist
     */


    public static ArrayList<Integer> reverse(ArrayList<Integer>list){

        ArrayList<Integer> rev = new ArrayList<>();

        for (int i = list.size()-1; i >=0; i--){
             rev.add(list.get(i));
        }

        return rev;
    }
}
