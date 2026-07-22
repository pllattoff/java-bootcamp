package javaecosystem.chapter01.enums;

import java.util.*;

public class PersonRepository {

    private Map<String, Person> persons;

    public PersonRepository(Map<String, Person> persons) {
        this.persons = persons;
    }

    public Optional<Person> getPersonById(String personId) {
        return Optional.ofNullable(persons.get(personId));
    }

    public  Map<Gender, Integer> getQtyByGender() {
        Map<Gender, Integer> qtyByGender = new HashMap<>();

        for (Person person : persons.values()) {
            Integer newQty = qtyByGender.get(person.gender()) == null ? 1 : qtyByGender.get(person.gender()) + 1;
            qtyByGender.put(person.gender(), newQty);
        }

        return qtyByGender;
    }

    public List<Person> getPersonByFavoriteDay(DayOfWeek dayOfWeek) {
        List<Person> personList = new ArrayList<>();

        for (Person person : persons.values()) {
            if (person.favoriteDay().equals(dayOfWeek)) {
                personList.add(person);
            }
        }
        return personList;
    }

    public Optional<Person> getPersonByName(String name) {
        return persons.values().stream()
                .filter(person -> person.name().equals(name))
                .findFirst();
    }
}
