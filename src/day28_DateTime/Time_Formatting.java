package day28_DateTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Time_Formatting {
    /*
    Warmup task:
	1. create an array of string, store three of your friends names in it

	2. create Array of localdates and store their birthdays in the same order

	3. use for loop to print out your friends' names and their birthdays

     */
    public static void main(String[] args) {


        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy MMM dd EEEE");
        String[] friends = {"Shox", "Doni", "Muhammad"};

        LocalDate ShoxBirthday = LocalDate.of(1997,01,13);
        LocalDate DoniBirthday = LocalDate.of(1997,05,03);
        LocalDate MBirthday = LocalDate.of(1997,8,07);

        LocalDate[] birthdays = {ShoxBirthday, DoniBirthday, MBirthday};

        for (int i = 0; i < friends.length; i++){

            String name = friends[i];
            LocalDate date = birthdays[i];
            System.out.println(name + "'s birthday is "+ date.format(dtf));


        }







    }
}
