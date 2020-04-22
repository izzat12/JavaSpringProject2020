package day09_NestedIf_Ternary;

public class Ternary_Practice2 {

    public static void main(String[] args) {

        int hour =14;
        String result = (hour<=12) ? "Good Morning" : (hour >12 && hour <18) ? "Good Afternoon"
                : "Good Evening";
        System.out.println(result);
        System.out.println("=========================================");

        int number = 1200;
        boolean divisibleBy3and5 = (number % 3==0 && number % 5==0) ? true : false;
        System.out.println(divisibleBy3and5);








    }
}
