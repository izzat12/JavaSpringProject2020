package day07_IfStatements;

public class If_Else_Statements {

    public static void main(String[] args) {

        int number = 0;

        if (number >=0);{
            System.out.println(number + " is positive");
        }
        if(number <0){
            System.out.println(number + " is  negative");
        }

        if(number >=0){
            System.out.println(number+ " is positive");
        } else {
            System.out.println(number + " is negative");
        }
////////////////////////////////////////////////////////////////////////////
        System.out.println("===================================================================");


        int a = 100;
        if(a % 2 ==0){
            System.out.println(a + " is even number");
        }
        if(a % 2 !=0){
            System.out.println(a + " is odd number");
        }

///////////////////////////////////////////////////////////////////////////
        boolean result = a % 2 ==0;
         if (result){
             System.out.println(a+ " is even number");
         }else{      //otherwise
             System.out.println(a+ " is odd number");
         }

        System.out.println("================================================");


         int age = 30;
         if(age >=21){          //TRUE
             System.out.println("here is your Vodka");
         }else{     //otherwise
             System.out.println("Go Home Kid");
         }

        System.out.println("==============================================");
////////////////////////////////////////////////////////////////////////////////

        boolean testedPositiveForCorona = true;

        if(testedPositiveForCorona){
            System.out.println("Buy more toilet papers and stay home");
        } else {
            System.out.println("Just Do more coding");
        }










    }


}
