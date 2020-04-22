package day13_StringClass;

import java.util.Scanner;

public class stringLiterals {
    public static void main(String[] args) {

    String str1 = "Cat";       ///String POOL
    String str2 = new String("Cat");         //Java Heap

        System.out.println(str1+ " : " +str2);
        System.out.println(str1==str2);     //false it is different type of String

        String str3 = "Cat";
        System.out.println(str1==str3);             //true

        String  str4 = new String("Cat");     //false
        System.out.println(str2==str4);               // two independent object



        String s1 = "Java";     // String pool, immutable we cannot modify it
        s1 = "JavaScript";           //new object will be created
        System.out.println(s1);

        String s2 = "Java";              // no new object will be created in the memory

        System.out.println(s1==s2);      //false
                       //"JavaScript == "Java";




    }
}
