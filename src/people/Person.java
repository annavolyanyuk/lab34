package people;
import enums.*;
import other.*;
import interfaces.*;
import java.util.Objects;
public abstract class Person implements GoTo {
    protected final String name;
    protected Mood mood;
    protected Status status = Status.AWAKE;
    protected Room room;
    public Person(String name){
        this.name = name;

    }
    public void speak(String speech){
        System.out.printf("\n%s: \"%s\"", name, speech);
        setMood(mood.HAPPY);
    }
    public void think(String thought){
        System.out.printf("%s thinks about %s\n", name, thought );
    }
    public void sit(Furniture furniture){
        System.out.printf("%s sit at the %s\n", name, furniture.getName());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name);
    }
    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }
    public String getName() {
        return name;
    }
    public Mood getMood() {
        return mood;
    }
    @Override
    public void goTo(Room room){
        setRoom(room);
        System.out.printf("%s goes to %s\n", name, room.getName());
    }
    @Override
    public void goTo(Room room, Person person) {
        setRoom(room);
        System.out.printf("%s goes to %s\n", name, room.getName());
    }
    public void setMood(Mood mood) {
        this.mood = mood;
    }
    public void setStatus(Status status) {
        this.status = status;
    }



    public void setRoom(Room room) {
        this.room = room;
    }
    public void showEmotion(){
        switch(mood){
            case HAPPY -> System.out.printf("%s smile\n", name);
            case SAD -> System.out.printf("%s cry\n", name);
            case NULL -> System.out.printf("%s is totally ok\n", name);
        }
    }
}
