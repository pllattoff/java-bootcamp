package oop.chapter04.javacollections.list.exercise;

import java.util.ArrayList;
import java.util.List;

public class School {

    private List<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
    }

    public void printStudents() {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public Student getStudent(int studentId) {
        for (Student student : students) {
            if (student.getStudentId() == studentId) {
                return student;
            }
        }
        return null;
    }

    public void deleteStudent(int studentId) {
        Student studentToDelete = null;

        for (Student student : students) {
            if (student.getStudentId() == studentId) {
                studentToDelete = student;
                break;
            }
        }

        if (studentToDelete != null) {
            students.remove(studentToDelete);
        }
    }

    public List<Course> getCourses(int studentId) {
        for (Student student : students) {
            if (student.getStudentId() == studentId) {
                return student.getCourses();
            }
        }
        return null;
    }

}
