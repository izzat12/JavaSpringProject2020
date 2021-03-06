package day28_DateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTime {
    public static void main(String[] args) {


        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);


        LocalDate date = LocalDate.of(2020,3,20);
        LocalTime time = LocalTime.of(11,25,30);

        LocalDateTime dateTime = LocalDateTime.of(date, time);
        System.out.println(dateTime);

        // combine
        LocalDateTime dateTime2 = LocalDateTime.of(2020,10,22,12,34,20);
        System.out.println(dateTime2);


        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate date2 = LocalDate.of(2019,3,21);
        System.out.println(date2.format(dtf));


    }
}
