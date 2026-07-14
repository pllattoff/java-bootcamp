package oop.chapter04.javacollections.map.exercise;

import oop.chapter04.javacollections.list.exercise.Course;
import oop.chapter04.javacollections.list.exercise.Student;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SchoolV2 {

    private Map<Integer, Student> students = new HashMap<>();

    public void addStudent(Student student) {
        students.put(student.getStudentId(), student);
    }

    public void printStudents() {
        for (Map.Entry<Integer, Student> entry : students.entrySet()) {
            System.out.println("Key (ID): " + entry.getKey() + ", Value (Student): " + entry.getValue());
        }
    }

    public Student getStudent(int studentId) {
        return students.get(studentId);
    }

    public void deleteStudent(int studentId) {
        students.remove(studentId);
    }

    public List<Course> getCourses(int studentId) {
        return students.get(studentId).getCourses();
    }

}
