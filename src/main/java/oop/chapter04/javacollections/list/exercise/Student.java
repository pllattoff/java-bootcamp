package oop.chapter04.javacollections.list.exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Student {

    private int studentId;
    private String firstName;
    private String lastName;

    private List<Course> courses = new ArrayList<>();


    public Student(int studentId, String firstName, String lastName) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setCourse(Course course) {
        courses.add(course);
    }

    public List<Course> getCourses() {
        return courses;
    }


    public int getStudentId() {
        return studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return getStudentId() == student.getStudentId() && Objects.equals(getFirstName(), student.getFirstName()) && Objects.equals(getLastName(), student.getLastName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getStudentId(), getFirstName(), getLastName());
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + getStudentId() +
                ", firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                '}';
    }
}
