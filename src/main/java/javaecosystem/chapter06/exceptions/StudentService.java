package javaecosystem.chapter06.exceptions;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.UUID;

public class StudentService {

    private final StudentRepo repo = new StudentRepo();

    public Student addNewStudent(Student newStudent) {
        Student studentToSave = newStudent.withId(UUID.randomUUID().toString());
        return repo.save(studentToSave);
    }

    public List<Student> getAllStudents(){
        return repo.getAllStudents();
    }

    public Student findById(String studentId) {
        return repo.findStudentById(studentId)
                .orElseThrow(() -> new NoSuchElementException("Student with ID = " + studentId + " not found!"));
    }
}
