package day28_DateTime;

import java.time.LocalTime;

public class Time {
    public static void main(String[] args) {

        LocalTime time1 = LocalTime.now();
        System.out.println(time1);

        System.out.println("===============================");

        LocalTime time2 = LocalTime.of(15,30,45);
        System.out.println(time2);

    }
}
