package day10_Swotch_Scanner;

public class days {
    public static void main(String[] args) {
        /*
        write a program that can display the days based on the numbers 1 ~ 7
			MUST USE NESTED IF

         */


        int number =3;
        String result = "";
        String result2 = "";


        if(number>=1&&number<=7){
            if(number ==1){
                result = "Monday";
            }else if(number ==2){
                result = "Tuesday";
            }else if(number ==3){
                result = "Wednesday";
            }else if(number==4){
                result = "Thursday";
            }else if(number ==5){
                result = "Friday";
            }else if(number ==6){
                result = "Saturday";
            }else{
                result = "Sunday";
            }
        }else{
            result= "Invalid Number";
        }

        //Ternary IF Statements
        if(number>=1&&number<=7){
            result2 = (number==1)? "Monday" : (number ==2)? "Tuesday" :
                    (number==3)? "Wednesday" : (number ==4)? "Thursday" :
                            (number==5)? "Friday": (number==6)? "Saturday" :(number==7)?
                                    "Sunday" : "Invalid";

        }

        System.out.println(result);
        System.out.println(result2);




    }
}

