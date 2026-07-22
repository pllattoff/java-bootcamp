package javaecosystem.chapter06.exceptions.guestlist;

import lombok.Data;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class GuestList {

    static final Path FILE_PATH = Path.of("guests.txt");
    private List<String> guests;


    public void setGuests(List<String> newGuests) throws IOException {
        guests = newGuests;

        Files.write(FILE_PATH, guests, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
    }

    public List<String> getGuests() throws IOException {
        guests = Files.readAllLines(FILE_PATH);
        return guests;
    }

//    public void addGuest(String guest) throws IOException {
//        Files.write(FILE_PATH, List.of(guest), StandardCharsets.UTF_8, StandardOpenOption.CREATE, StandardOpenOption.APPEND);
//    }

}
