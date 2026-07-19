package javaecosystem.chapter03.streamapi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Main {
    static void main() {

        List<Integer> numbers = new ArrayList<>(List.of(3,4,5,6,7,8,9,10,2,1));
//        List<Integer> numbers = List.of();

        numbers.stream()
                .filter(number -> number % 2 == 0)
                .map(number -> number * 2)
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);

        System.out.println("================================");

        Integer sum1 = numbers.stream()
                .reduce(0, (a, b) -> a + b);
        Integer sum2 = numbers.stream()
                .reduce(0, Integer::sum);
        System.out.println("sum1(" + sum1 + ") = sum2(" + sum2 + ")");

        Optional<Integer> max = numbers.stream()
                .reduce(Integer::max);
        Optional<Integer> min = numbers.stream()
                .reduce(Integer::min);
        System.out.println("max = " + max.orElse(null) + "; min = " + min.orElse(null));

        System.out.println("================================");

        List<Integer> resultList = numbers.stream()
                .filter(number -> number % 2 == 0)
                .map(number -> number * 2)
                .sorted(Comparator.reverseOrder())
                .toList();
        System.out.println("resultList: " + resultList);

        System.out.println("================================");
    }
}
