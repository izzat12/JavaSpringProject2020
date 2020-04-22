package day10_Swotch_Scanner;
public class numberOfDays {
    public static void main(String[] args) {
        /*
        write a program that can find the number of days in a month
	 	(Assume that Feb has 28 days)
		 		28 days: 2
		 		30 days: 4,6, 9, 11
		 		31 days: 1,3,5,7,8,10,12       MUST USE NESTED IF
         */

        int number = 12;

        boolean days28 = number ==2;
        boolean days30 = number ==4 || number ==6 || number ==9 || number ==11;

        String result = "";

        if(number >0 && number <13){
            result = (days28)? "Has 28 days" : (days30)? "has 30 days" : "has 31 days";

        }else{
            result = "Invalid";
        }
        System.out.println(result);










    }
}
