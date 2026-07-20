package javaecosystem.chapter05.lombok;

import java.util.List;

public class Main {
    static void main() {

        Teacher teacher1 = new Teacher(1, "Teacher Name 1", "Math");
        Teacher teacher2 = new Teacher(2, "Teacher Name 2", "Physics");

        Student student1 = new Student(1, "Max", "address 1", 8);
        Student student2 = new Student(2, "John", "address 2", 8);
        Student student3 = new Student(3, "Ann", "address 3", 8);

        Course course1 = new Course(1, "Course Name 1", teacher1, List.of(student1, student2, student3));
        Course course2 = new Course(2, "Course Name 2", teacher2, List.of(student1, student3));

        System.out.println(course1);
        System.out.println(course2);

        System.out.println("Students of the Course 1:");
        course1.getStudents().stream()
                .forEach(System.out::println);

        System.out.println("Students of the Course 2:");
        course2.getStudents().stream()
                .forEach(System.out::println);

    }
}
