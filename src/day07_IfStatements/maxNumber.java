package day07_IfStatements;

import java.sql.SQLOutput;

/*
write a java program that accepts three numbers and
return the maximum number
(assume that none of them are equal)

 */
public class maxNumber {
    public static void main(String[] args) {

        double result1 = 50;
        double result2 = 60.5;
        double result3 = 60;

        boolean result1Greater = result1 > result2 && result1 > result2;  //if result1 is greater than them
        boolean result2Greater = result2 > result1 && result2 > result3;
     //   boolean result2Greater2 = result2 > result1 || result2 > result3;
        boolean result3Greater = result3 > result1 && result3 > result2;

        if(result1Greater){

            System.out.println(result1 + " is greater number");
        }
        if( result2Greater){
            System.out.println(result2 + " is greater number ");

        }
        if(result3Greater){
            System.out.println(result3 + " is greater number");

        }


    }
}
