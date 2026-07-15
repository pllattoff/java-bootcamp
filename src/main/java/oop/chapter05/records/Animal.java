package oop.chapter05.records;

public record Animal(Integer id, String name, Species species, Integer age, Owner owner) {

    public Animal withId(Integer id) {
        return new Animal(id, name, species, age, owner);
    }

    public Animal withName(String name) {
        return new Animal(id, name, species, age, owner);
    }

    public Animal withSpecies(Species species) {
        return new Animal(id, name, species, age, owner);
    }

    public Animal withAge(Integer age) {
        return new Animal(id, name, species, age, owner);
    }

    public Animal withOwner(Owner owner) {
        return new Animal(id, name, species, age, owner);
    }

}
