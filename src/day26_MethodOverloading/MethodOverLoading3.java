package day26_MethodOverloading;

public class MethodOverLoading3 {

    /*
    first method: can find the sum of the two int number
    second method: can find sum of the two double numbers
     */

    public static void main(String[] args) {

        sum(10,20);
        sum(1.2,4.4);

        // if we put without value name or variableName, it will not print...
      double number1 =  sum(10,15.5);

        System.out.println(number1);

       double number2 = sum(25L, 24l);
        System.out.println(number2);

               //  int value V
       /// double number3 = sum(3,4); /// void method does not return any value




    }



    public static void sum(int a, int b){
        System.out.println(a+b);
    }


    public static double sum(double a, double b){ //
        return a+b;
    }


}
