package other;
import exceptions.NoSpaceError;
import people.*;

public class House {
    private final Room[] rooms;
    private final Person[] people;
    private int roomCount;
    private int peopleCount;

    public House(int roomCapacity, int peopleCapacity) {
        rooms = new Room[roomCapacity];
        people = new Person[peopleCapacity];
        roomCount = 0;
        peopleCount = 0;
    }

    public void addRoom(Room room) {
        if (roomCount < rooms.length) {
            rooms[roomCount++] = room;
           //System.out.printf("\n%s is added into house", room.getName());
        } else {
            throw new NoSpaceError("There is not enough space for new room");
        }
    }
    public void addPerson(Person person) {
        if (peopleCount < people.length) {
            people[peopleCount++] = person;
        } else {
            System.out.printf("\nThere isn't enough space for %s", person.getName());
        }
    }
}
