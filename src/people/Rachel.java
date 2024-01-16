package people;

public class Rachel extends Person {
    public Rachel(String name) {
        super("Rachel");
    }

    public void carryChild(Person child) {
        System.out.printf("%s carry %s", name, child.getName());
    }

    public void checkPlace(int numberOftimes) {
        switch (numberOftimes) {
            case 1:
                System.out.println(", checked places one time");
                break;
            case 2:
                System.out.println(", checked places two times");
                break;
            default:
                System.out.println(", checked places a lot of times");
        }

    }
    public void askToReplace(Movers movers) {
        System.out.printf("asked to replace %s something", movers.getName());
    }
}