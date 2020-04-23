package day27_DataTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Dates_Formating {
    public static void main(String[] args) {

        // To format the dates
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MMM/yyyy");
        LocalDate date1 = LocalDate.now();
        System.out.println(date1.format(dtf));

        System.out.println("=====================================");

        /*
        create a date called birthDay: month/days/year
         */


        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("MMM/dd/yy");

        LocalDate date2 = LocalDate.of(1994,12,30);
        String str1 = date2.format(dtf2);
        System.out.println(str1);


    }
}
