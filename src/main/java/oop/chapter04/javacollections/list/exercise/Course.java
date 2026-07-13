package oop.chapter04.javacollections.list.exercise;

public class Course {

    private String courseName;
    private String instructor;
    private int room;

    public Course(String courseName, String instructor, int room) {
        this.courseName = courseName;
        this.instructor = instructor;
        this.room = room;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", instructor='" + instructor + '\'' +
                ", room=" + room +
                '}';
    }
}
