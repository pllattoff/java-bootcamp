package javaecosystem.chapter01.enums;

import java.util.HashMap;
import java.util.Map;

public class PersonRepository {

    private Map<String, Person> persons;

    public PersonRepository(Map<String, Person> persons) {
        this.persons = persons;
    }

    public Person getPersonById(String personId) {
        return persons.get(personId);
    }

    public  Map<Gender, Integer> getQtyByGender() {
        Map<Gender, Integer> qtyByGender = new HashMap<>();

        for (Person person : persons.values()) {
            Integer newQty = qtyByGender.get(person.gender()) == null ? 1 : qtyByGender.get(person.gender()) + 1;
            qtyByGender.put(person.gender(), newQty);
        }

        return qtyByGender;
    }
}
