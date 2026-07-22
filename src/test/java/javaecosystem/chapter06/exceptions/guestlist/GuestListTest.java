package javaecosystem.chapter06.exceptions.guestlist;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

import static javaecosystem.chapter06.exceptions.guestlist.GuestList.FILE_PATH;
import static org.junit.jupiter.api.Assertions.*;

class GuestListTest {

    @Test
    void shouldBeEmptyInitially() throws IOException {
        //GIVEN
        GuestList guestList = new GuestList();
        List<String> emptyGuestList = new ArrayList<>();
        guestList.setGuests(emptyGuestList);

        //WHEN
        //THEN
        assertEquals(emptyGuestList, guestList.getGuests());
    }

    @Test
    void shouldReadSameGuestsAsWrittenBefore() throws IOException {
        //GIVEN
        GuestList guestList = new GuestList();
        List<String> expected = new ArrayList<>(List.of("Karl", "Ute"));
        guestList.setGuests(expected);

        //WHEN
        //THEN
        assertEquals(expected, guestList.getGuests());
    }

    @Test
    void shouldWriteToFileSystem() throws IOException {
        //GIVEN
        GuestList guestList = new GuestList();
        List<String> expected = new ArrayList<>(List.of("Theodor", "Anette"));

        //WHEN
        guestList.setGuests(expected);
        List<String> actual = Files.readAllLines(FILE_PATH);

        //THEN
        assertTrue(Files.exists(FILE_PATH));
        assertEquals(expected, actual);
    }

    @Test
    void shouldReadFromFileSystem() throws IOException {
        //GIVEN
        GuestList guestList = new GuestList();
        List<String> expected = List.of("Stephan", "Max");
        Files.write(FILE_PATH, expected, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);

        //WHEN
        List<String> actual = guestList.getGuests();

        //THEN
        assertEquals(expected, actual);
    }

    @Test
    void shouldThrowException_whenFileNotExist() throws IOException {
        //GIVEN
        GuestList guestList = new GuestList();
        Files.deleteIfExists(FILE_PATH);

        //WHEN
        //THEN
        assertThrows(IOException.class, guestList::getGuests);
    }

//    @Test
//    void addGuest() throws IOException {
//        //GIVEN
//        GuestList guestList = new GuestList();
//        List<String> expected = new ArrayList<>(List.of("Theodor", "Anette"));
//        Files.write(FILE_PATH, expected, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
//        expected.add("John");
//
//        List<String> actual = Files.readAllLines(FILE_PATH);
//
//        //WHEN
//        guestList.addGuest("John");
//
//        //THEN
//        assertEquals(expected, actual);
//    }
}