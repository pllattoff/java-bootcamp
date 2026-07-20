package javaecosystem.chapter05.lombok;

import lombok.*;

import java.util.List;

@With
@Value
public class Course {

    Integer id;
    String name;
    Teacher teacher;
    List<Student> students;

}

