package javaecosystem.chapter01.enums;

import java.util.HashMap;
import java.util.Map;

public class Main {
    static void main() {

        System.out.println(DayOfWeek.MONDAY);
        System.out.println(DayOfWeek.MONDAY.getDayOrWeekend());
        System.out.println(DayOfWeek.SATURDAY.getDayOrWeekend());


        Person person1 = new Person("1", "Max", DayOfWeek.FRIDAY, Gender.MALE);
        Person person2 = new Person("2", "John", DayOfWeek.FRIDAY, Gender.MALE);
        Person person3 = new Person("3", "Anna", DayOfWeek.SATURDAY, Gender.FEMALE);
        Map<String, Person> persons = new HashMap<>();
        persons.put(person1.id(), person1);
        persons.put(person2.id(), person2);
        persons.put(person3.id(), person3);

        PersonRepository personRepository = new PersonRepository(persons);

        System.out.println(personRepository.getPersonById("1"));
        System.out.println(personRepository.getPersonById("2"));
        System.out.println(personRepository.getPersonById("3"));

        System.out.println(personRepository.getQtyByGender());

    }
}
