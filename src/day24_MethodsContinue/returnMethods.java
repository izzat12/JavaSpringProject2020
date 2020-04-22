package day24_MethodsContinue;

public class returnMethods {

    public static void main(String[] args) {

      //  int a = maxNumber(10,20);

       int result = Addition(1000,2000);
        System.out.println(result);
        int result2 = result + 2000;

        System.out.println(result2);

    }



    public static int Addition(int a, int b){

      //  System.out.println(a+b);
        return a+b;
    }



    public static void maxNumber(int a, int b){

        if (a>=b){
            System.out.println(a);
        }else{
            System.out.println(b);
        }
    }



}
