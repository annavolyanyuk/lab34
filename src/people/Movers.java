package people;
import other.*;
import interfaces.*;
public class Movers extends Person implements MoveAble {

    public Movers(String name) {
        super(name);
    }
    public String[] unloadTruck(String[] truck) {
        System.out.printf("%s unload truck...\n", name);
        for (int i = 0; i < truck.length; i++) {
            System.out.printf("Unloaded things: %s\n",truck[i]);
        }
        System.out.println("The car is empty.\n");
        return new String[0];
    }
    @Override
     public void move(Furniture furniture, Room room){

        System.out.printf("%s move %s in %s\n", name, furniture.getName(), room.getName());
    }

}


