package javaecosystem.chapter05.lombok;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Student {

    private Integer id;
    private String name;
    private String address;
    private int grade;

}
