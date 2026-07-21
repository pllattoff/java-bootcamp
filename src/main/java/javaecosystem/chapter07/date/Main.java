package javaecosystem.chapter07.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Main {

    static void main() {

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        //Add a timespan of 2 weeks to the current date and output the new date
        LocalDateTime newLocalDateTime = localDateTime.plusWeeks(2);
        System.out.println(newLocalDateTime);

        //Compare the current date with a specified future date and output whether the current date is before or after the specified date
        System.out.println("newLocalDateTime.isBefore(localDateTime): " + newLocalDateTime.isBefore(localDateTime));
        System.out.println("newLocalDateTime.isAfter(localDateTime): " + newLocalDateTime.isAfter(localDateTime));

        //Calculate the difference in days between two arbitrary dates and output the result
        long diffDays = ChronoUnit.DAYS.between(localDateTime, newLocalDateTime);
        System.out.println("diffDays: " + diffDays);

        //Write a class Animal and add an attribute birthday and name to it
        Animal animal = new Animal("Tom", LocalDate.of(2020, 05, 01));

        LocalDate birthday = animal.birthday();
        LocalDate today = LocalDate.now();
        LocalDate birthdayThisYear = birthday.withYear(today.getYear());
        LocalDate nextBirthday = (birthdayThisYear.isAfter(today) || birthdayThisYear.isEqual(today)) ? birthdayThisYear : birthdayThisYear.plusYears(1);

        long leftDays = ChronoUnit.DAYS.between(today, nextBirthday);

        System.out.println("birthday: " + birthday);
        System.out.println("birthdayThisYear: " + birthdayThisYear);
        System.out.println("nextBirthday: " + nextBirthday);
        System.out.println("today: " + today);
        System.out.println("leftDays: " + leftDays);
    }

}
