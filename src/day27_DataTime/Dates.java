package day27_DataTime;


import java.time.LocalDate;

public class Dates {
    public static void main(String[] args) {

        LocalDate date1 = LocalDate.of(2020,10,25);
        System.out.println(date1);

        LocalDate birthday = LocalDate.of(2020, 12,25);
        System.out.println(birthday);

        //isAfter();
        boolean result1 = date1.isAfter(birthday);
        System.out.println(result1);

        //isBefore();
        boolean result2 = date1.isBefore(birthday);
        System.out.println(result2);

        //isEqual();
        boolean result3 = date1.isEqual(birthday);
        System.out.println(result3);

        //isLeapyear();
        boolean result4 = birthday.isLeapYear();
        System.out.println(result4);

        System.out.println("=====================================");


        LocalDate now = LocalDate.now();
        System.out.println("Today is "+now);

        System.out.println("=================================");

/*
        LocalDate birthdat = LocalDate.of(1994,12,25);
      int month =  birthdat.getMonthValue();
      int days = birthdat.getDayOfMonth();
*/

      String str  = now.toString();
        System.out.println();




    }
}
