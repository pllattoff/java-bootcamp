package javaecosystem.chapter03.streamapi;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class MainBonus {
    static void main() throws IOException {

        List<Student> students = Files.lines(Path.of("java streams - students.csv"))
                .peek(System.out::println)
                .skip(1)
                .distinct()
                .filter(line -> !line.isEmpty())
                .map(line -> line.split(","))
                .map(lineAsArray -> new Student(
                        Integer.parseInt(lineAsArray[0]),
                        lineAsArray[1],
                        lineAsArray[2],
                        Integer.parseInt(lineAsArray[3])))
                .toList();

        System.out.println("---");

        students.forEach(System.out::println);


    }
}
