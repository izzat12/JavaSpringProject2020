package day06_Shorthand_LogicalOperators;

public class IfStatementPractice {
    public static void main(String[] args) {

        int a =100;
        int b = 200;

        if(b>a){     // True
            System.out.println(b+" is greater than " +a);
        }

        if (a>b){      // False: it does not executed

            System.out.println(a+ " is greater than " +b);
        }

        if (a ==b){
            System.out.println(a+ " is equal "+b);
        }
 //////////////////////////////////////////////////////////////////////////////

  int x = 200;
        int y = 300;
        boolean xGreater = x > y;
        boolean yGreater = y >x;
        if(xGreater){
            System.out.println(x+ " is greater than " +y);
        }

        if (yGreater){
            System.out.println(y+" is greater than " +x);
        }

        if (xGreater == yGreater){
            System.out.println(x+ " is equal to "+y);
        }









    }




}
