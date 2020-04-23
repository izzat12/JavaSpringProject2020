package day27_DataTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Dates_Formating {
    public static void main(String[] args) {

        // To format the dates
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MMM/yyyy");
        LocalDate date1 = LocalDate.now();
        System.out.println(date1.format(dtf));


    }
}
