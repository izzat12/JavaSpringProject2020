package day_Unary_ShorthandOperators;

public class leapYear {

    /*

      create a class called leapyear, and write a program that can identify
      if the given is leap Year, print true if its leap year
     */
    public static void main(String[] args) {

        short year = 2020;

        boolean leapYear = year % 4 ==0;     //if the year can be divided by 4 without any remainder

       // System.out.println(year + " is leap year: " + leapYear);

        String result = year + " is leap year: " + leapYear;
        System.out.println(result);





    }


}
