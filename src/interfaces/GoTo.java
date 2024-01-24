package interfaces;
import other.*;
import people.*;

public interface GoTo {
    String goTo(Room room, Person person);
    void goTo(Room room);
}
