package other;

import exceptions.NoSpaceError;
import people.Person;

public class Furniture {
    private final String name;
    private Person[] persons;
    private int personsCount;


    public Furniture(String name) {
        this.name = name;
    }
    public Furniture(String name, int capacity) {
        this.name = name;
        this.persons = new Person[capacity];
        this.personsCount = 0;
    }
    public void addPerson(Person person) {
        if (personsCount < persons.length) {
            persons[personsCount++] = person;
        } else {
            throw new NoSpaceError("There is not enough space for " + person.getName());
        }
    }

    public String getName() {
        return name;
    }

}

