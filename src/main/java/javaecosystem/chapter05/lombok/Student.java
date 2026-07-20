package javaecosystem.chapter05.lombok;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.With;

@Builder
@With
@Data
@AllArgsConstructor
public class Student {

    private Integer id;
    private String name;
    private String address;
    private Integer grade;

}
