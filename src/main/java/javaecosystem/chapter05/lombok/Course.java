package javaecosystem.chapter05.lombok;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.With;

import java.util.List;

@Builder
@With
@Data
@AllArgsConstructor
public class Course {

    private Integer id;
    private String name;
    private Teacher teacher;
    private List<Student> students;

}
