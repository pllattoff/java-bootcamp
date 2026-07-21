package javaecosystem.chapter05.lombok;

import java.util.List;

public class UniversityService {

    public Double calculateAvgGrade(University university) {

        double average  = university.courses().stream()
                .flatMap(course -> course.getStudents().stream())
                .mapToInt(Student::getGrade)
                .average()
                .orElse(0.0);

        return Math.round(average * 100.0) / 100.0;
    }

    public List<Student> getStudentsWithMinGrade(University university) {

        return university.courses().stream()
                .flatMap(course -> course.getStudents().stream())
                .filter(student -> student.getGrade() <= 2)
                .toList();
    }

}
