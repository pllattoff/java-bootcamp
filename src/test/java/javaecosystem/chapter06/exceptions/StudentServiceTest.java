package javaecosystem.chapter06.exceptions;

import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

class StudentServiceTest {

    @Test
    void findById_shouldThrowException_whenStudentNotFound() {
        //GIVEN
        StudentService studentService = new StudentService();
        String studentId = "-1";

        //WHEN
        //THEN
        assertThrows(NoSuchElementException.class, () -> studentService.findById(studentId));
    }
}