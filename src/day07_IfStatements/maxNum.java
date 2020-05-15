package day07_IfStatements;

public class maxNum {

    public static void main(String[] args) {

        double result1 = 20.2;
        double result2 = 20.7;
        double result3 = 21;

        boolean result1Max = result1 > result2 && result1 > result3;
        boolean result2Max = result2 > result1 && result2 > result3;
        boolean result3Max = result3 > result1 && result3 > result2;

        if (result1Max){
            System.out.println("result 1 is greatest");
        }else if (result2Max){
            System.out.println("result 2 is greatest");
        }else{
            System.out.println("result 3 is greatest");
        }

        System.out.println("==================================");


        boolean result1Medium = (result1 < result2 && result1 > result3) || (result1 > result2 && result1< result3 );
        boolean result2Medium = (result2 < result1 && result2 > result3) || (result2>result1 && result2<result3);
        boolean result3Medium = (result3 > result1 && result3 < result2) || (result3 <result1 && result3 > result2);


        if (result1Medium){
            System.out.println(result1 + " is the medium number");
        }else if (result2Medium){
            System.out.println(result2 +" is the medium number");
        }else{
            System.out.println(result3 + " is the medium");
        }

        System.out.println("=================================");

        boolean minNumber = result1 < result2 && result1 < result3;
        boolean minNumber2 = result2 < result1 && result2 < result3;
        boolean minNumber3 = result3 < result1 & result3 < result2;

        if (minNumber){
            System.out.println(result1 + " is the minimum number");
        }else if (minNumber2){
            System.out.println(result2 + " is the minimum number");
        }else{
            System.out.println(result3 + " is the minimum number");
        }



    }
}
