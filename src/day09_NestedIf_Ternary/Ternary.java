package day09_NestedIf_Ternary;

public class Ternary {
    public static void main(String[] args) {

        int num = 101;
        String result = "";

        if (num % 2 ==0){
            result = "Oven";
        }else {
            result = "Odd";
        }
        System.out.println("=======================================");
   ///////////////////////////////////////////////////////

       // in ternary: ? means IF         : else keyword.
        String result2 = (num % 2 ==0) ? "Even" : "Odd";

        System.out.println(result);
        System.out.println(result2);


       /*
        // if the if statement is only returning value and assigning it to
        variable then we can apply ternary.
        */
        System.out.println("===============================================");


        int a = 100;
        int b = 200;
        int max = 0;

        if(a >b ){
            max = a;
        }else {
            max =b;
        }

        int max2 = (a > b) ? a : b;
        System.out.println(max);
        System.out.println(max2);

        System.out.println("============================================");

        String str = "";
        if(true){
            str = "Hello";
        }
        System.out.println(str);

        String str2 = (true) ? "Hello " : " Halo";
        System.out.println(str2);




    }
}
