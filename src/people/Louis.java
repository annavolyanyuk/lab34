package people;

public class Louis extends Person {

    public Louis(String name) {
        super(name);
    }

    @Override
    public void think(String thought) {
        System.out.printf("%s thinks about %s\n", name, thought);
        if (thought.contains("beer") && thought.contains("Bangor")) {
            class JudCrandall  {
                final String name = "Jud Crendell";

                void remind() {
                    System.out.printf("This thought reminded about %s\n", name);
                }
            }
            JudCrandall judCrandall = new JudCrandall();
            judCrandall.remind();
        } else {
            System.out.printf("%s thinks", name);
        }

    }

    public void dealtWithMoving() {
        System.out.printf("%s dealt with the moving\n", name);
    }

    public void giveCheck(String[] truck, Movers movers) {
        if (truck.length == 0) {
            System.out.printf("%s give a check to %s\n", name, movers.getName());
        } else {
            System.out.print("The car is not empty yet\n");
        }
    }
}

