package people;
import other.*;
import interfaces.*;
import exceptions.*;
public class Movers extends Person implements MoveAble {

    public Movers(String name) {
        super(name);
    }
    public void unloadTruck (String[] truck) throws EmptyTruckException{
        if (truck != null && truck.length != 0) {
            System.out.printf("%s unload truck...\n", name);
            for (String s : truck) {
                System.out.printf("Unloaded things: %s\n", s);
            }
            System.out.println("The car is empty.\n");
        } else {
            throw new EmptyTruckException("Cannot unload the truck because there aren't any things in truck.");
        }
    }
    @Override
     public void move(Furniture furniture, Room room){

        System.out.printf("%s move %s in %s\n", name, furniture.getName(), room.getName());
    }
}


