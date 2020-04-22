package day04_JavaRecap;

import java.sql.SQLOutput;

public class Variables_Practice2 {

    public static void main(String[] args) {

        /*

        task: write a program to find the area and primeter of the
        circle radius=?
        area = r * r * 3.14
        p = 2 * 3.14 * r
         */

        double radious = 5;         /// MUST
        double PI = 3.14;

        double area = radious * radious * PI;

        double primeter = 2 * PI * radious;

        // the area of the circle that has a radious of 2.5 is: Area
        System.out.println("The area of the circle that has a radious of " + radious+ " is: " +area);

        //the primeter of the circle that has a radious of 2.5 is: Area
        System.out.println("the primter of the circle that has a radious of " +radious+ " is: " +primeter);







        double circ1 = 3;
        double circ2 = 5;

        boolean circle1 = circ1 > circ2;
        boolean circle2 = circ2 > circ1;

        System.out.println(circle2);


        int  a = 10;

    }
}
