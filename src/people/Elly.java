package people;

import enums.Status;
import interfaces.SleepAble;
import java.util.ArrayList;

public class Elly extends Person implements SleepAble {
    public Elly(String name) {
        super(name);
    }
    public String sleep() {
        setStatus(Status.SLEEP);
        class Things {
            private final String nameOfthing;
            Things(String nameOfthing) {
                this.nameOfthing = nameOfthing;
            }
            public String getNameOfThing() {
                return nameOfthing;
            }
        }

        ArrayList<Things> thingsList = new ArrayList<>();
        thingsList.add(new Things ("toys"));
        thingsList.add(new Things ("books"));
        thingsList.add(new Things ("clothes"));
        ArrayList<String> thingNames = new ArrayList<>();
        for (Things thing : thingsList) {
            thingNames.add(thing.getNameOfThing());
        }
        return name + " sleeps among " + String.join(", ", thingNames);
    }
}
