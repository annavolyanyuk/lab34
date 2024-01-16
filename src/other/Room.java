package other;

import exceptions.NoSpaceError;
import enums.*;
import people.Person;

public class Room {
    private String name;
    private Person[] persons;
    private int personsCount;
    private Bed bed;

    public Room(String name, int capacity) {
        this.name = name;
        this.persons = new Person[capacity];
        this.personsCount = 0;
        this.bed = new Bed("bed");
    }
    public void addPerson(Person person) {
        if (personsCount < persons.length) {
            persons[personsCount++] = person;
            setName(name);
        } else {
            throw new NoSpaceError("In " + name + "'s room " + " is not enough space " + person.getName());
        }
    }
    public Bed getBed() {
        return bed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "\n" + this.name;
    }

}