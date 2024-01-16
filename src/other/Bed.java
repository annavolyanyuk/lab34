package other;
import people.Person;

public class Bed extends Furniture{
    //hello
    private final Mattress mattress;
    public Bed(String name){
        super("bed");
        this.mattress = new Mattress();
    }


    public class Mattress {
        public void addPerson(Person p) {
            System.out.println(" on matress");
        }
    }

    public void addPerson(Person p) {
        System.out.println(" on bed");
    }

    public Mattress getMattress() {
        return mattress;
    }
}

