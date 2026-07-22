package javaecosystem.chapter01.enums;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

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

        //Optionals
        Optional<Person> personOptional1 = personRepository.getPersonById("1");
        Optional<Person> personOptional2 = personRepository.getPersonById("1");
        Optional<Person> personOptional3 = personRepository.getPersonById("1");

        System.out.println(personOptional1);
        System.out.println(personOptional2);
        System.out.println(personOptional3);

        personOptional1.ifPresent(person -> System.out.println(person.name() + " " + person.favoriteDay()));

        //search and return a person by their name
        personRepository.getPersonByName("Anna").ifPresent(System.out::println);


        // counts the number of persons by gender
        System.out.println(personRepository.getQtyByGender());

        // searches for and returns all persons by their favorite day of the week
        System.out.println(personRepository.getPersonByFavoriteDay(DayOfWeek.FRIDAY));
        System.out.println(personRepository.getPersonByFavoriteDay(DayOfWeek.SATURDAY));

    }
}
