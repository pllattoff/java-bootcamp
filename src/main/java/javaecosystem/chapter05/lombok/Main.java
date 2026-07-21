package javaecosystem.chapter05.lombok;

import java.util.List;

public class Main {
    static void main() {

        Teacher teacher1 = new Teacher(1, "Teacher Name 1", "Math");
        Teacher teacher2 = new Teacher(2, "Teacher Name 2", "Physics");
        Teacher teacher3 = teacher2.withId(3).withName("Teacher Name 3");

        Student student1 = Student.builder()
                .id(2)
                .name("Max")
                .grade(2)
                .build();
        Student student2 = Student.builder()
                .id(3)
                .name("John")
                .address("address 2")
                .grade(1)
                .build();
        Student student3 = Student.builder()
                .id(1)
                .name("Anna")
                .grade(1)
                .build();

        Course course1 = new Course(1, "Course Name 1", teacher1, List.of(student1, student2, student3));
        Course course2 = new Course(2, "Course Name 2", teacher2, List.of(student1, student3));
        Course course3 = course2.withId(3).withTeacher(teacher3);

        System.out.println(course1);
        System.out.println(course2);

        System.out.println("Students of the Course 1:");
        course1.getStudents().stream()
                .forEach(System.out::println);

        System.out.println("Students of the Course 2:");
        course2.getStudents().stream()
                .forEach(System.out::println);

        System.out.println("Teacher of the Course 3:");
        System.out.println(course3.getTeacher());


        University university1 = University.builder()
                .id(1)
                .name("University 1")
                .courses(List.of(course1, course2, course3))
                .build();

        UniversityService universityService = new UniversityService();
        System.out.println("The average grade of the entire university 1:");
        System.out.println(universityService.calculateAvgGrade(university1));

        System.out.println("All students of a university with a minimum grade of 2:");
        universityService.getStudentsWithMinGrade(university1)
                .forEach(System.out::println);

    }
}
