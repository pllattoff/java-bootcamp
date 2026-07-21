package javaecosystem.chapter07.date;

import java.time.LocalDate;

public record Animal(
        String name,
        LocalDate birthday
) {
}
