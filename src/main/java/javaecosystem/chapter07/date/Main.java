package javaecosystem.chapter07.date;

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
    }

}
