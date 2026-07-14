package oop.chapter04.javacollections.map.exercise;

import oop.chapter04.javacollections.list.exercise.Course;
import oop.chapter04.javacollections.list.exercise.Student;

import java.util.List;

public class Main {
    static void main() {

        Student student1 = new Student(1, "John", "Smith");
        Student student2 = new Student(2, "Anna", "Schmidt");
        Student student3 = new Student(3, "Laura", "Fischer");
        Student student4 = new Student(4, "Michael", "Brown");
        Student student5 = new Student(5, "Emily", "Wilson");

        SchoolV2 school = new SchoolV2();
        school.addStudent(student1);
        school.addStudent(student2);
        school.addStudent(student3);
        school.addStudent(student4);
        school.addStudent(student5);

        System.out.println("List of the school's students:");
        school.printStudents();

        //Suchen
        int studentId = 2;
        System.out.println("Search for a student by ID: " + studentId);
        System.out.println(school.getStudent(studentId));

        //Löschen
        int studentIdToDelete = 4;
        System.out.println("Removal of a student with an ID: " + studentIdToDelete);
        school.deleteStudent(studentIdToDelete);
        school.printStudents();


        // Bonus: Kurs
        Course course1 = new Course("Java Programming", "Dr. Miller", 101);
        Course course2 = new Course("Database Systems", "Prof. Smith", 205);
        Course course3 = new Course("Software Engineering", "Dr. Johnson", 310);

        student1.setCourse(course1);
        student1.setCourse(course2);
        student1.setCourse(course3);

        List<Course> student1Courses = school.getCourses(student1.getStudentId());
        for (Course course : student1Courses) {
            System.out.println(course);
        }

    }
}
