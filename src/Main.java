import enums.Mood;
import other.Room;
import people.*;
import other.*;
import interfaces.*;

public class Main {
    public static void main(String[] args) {
        Gadge gadge = new Gadge("Gadge");
        Elly elly = new Elly("Elly");
        Louis louis = new Louis("Louis");
        Rachel rachel = new Rachel("Rachel");
        Furniture furniture = new Furniture("things");
        Room elliesRoom = new Room("Ellie's room", 2);
        Room gadgeRoom = new Room("Gadge's room", 2);
        Room kitchen = new Room("kitchen", 5);
        Room garage = new Room("garage", 10);
        Room porch = new Room("porch", 5);
        Movers movers = new Movers("movers");
        House house = new House(10, 10);

        house.addRoom(elliesRoom);
        house.addRoom(gadgeRoom);
        house.addRoom(kitchen);
        house.addRoom(garage);
        house.addRoom(porch);
        house.addPerson(louis);
        house.addPerson(rachel);

        elliesRoom.addPerson(elly);
        gadgeRoom.addPerson(gadge);
        gadge.setMood(Mood.TIRED);
        System.out.print(gadge.sleep());
        gadgeRoom.getBed().addPerson(gadge);
        elly.setMood(Mood.TIRED);
        System.out.print(elly.sleep());
        elliesRoom.getBed().getMattress().addPerson(elly);
        SleepAble cherch = new SleepAble(){
            @Override
            public String sleep(){
                return "Cherch sleeps purring";
            }
        };
        System.out.println(cherch.sleep());
        rachel.carryChild(gadge);
        rachel.checkPlace(2);
        rachel.askToReplace(movers);
        louis.doSmt();
        louis.goTo(porch);
        String[] truck = {"clothes", "furniture", "boxes", "toys", "kitchen equipment"};
        truck = movers.unloadTruck(truck);
        movers.move(furniture, garage);
        louis.giveCheck(truck, movers);
        louis.think("beer in Bangor");
        Furniture table = new Furniture("table");
        GoTo goToRoom = new GoTo(){
            @Override
            public void goTo(Room room, Person person){
                System.out.printf("%s goes to %s\n", person.getName(), room.getName());
            }
            @Override
            public void goTo(Room room) {
            }
        };
        goToRoom.goTo(kitchen, louis);
        goToRoom.goTo(kitchen, rachel);
        kitchen.addPerson(louis);
        kitchen.addPerson(rachel);
        louis.sit(table);
        rachel.sit(table);
        rachel.setMood(Mood.TORTURED);
        louis.speak("Hey, go to sleep!");
        rachel.speak("Is it doctors order?");
        louis.speak("Yes");
        rachel.speak("Okey, i am " + rachel.getMood() + ". Are you going to bedroom with me?" );
        louis.speak("No, i dont want to. That old man from street...");
        rachel.speak("Road. Call it road. We are not in the city. Or if you and Jud Crendell are such good friends, you may call it \"roud\"");
        louis.setMood(Mood.TIRED);
        louis.speak("Okey. Also he invited me to drinks. I want to see him. I am "+ louis.getMood() + ", but i dont wanna sleep.");
        rachel.showEmotion();
    }
}