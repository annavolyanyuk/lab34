package people;
import enums.Status;
import interfaces.*;
public class Gadge extends Person implements SleepAble{
    public Gadge(String name){
        super(name);
    }
    @Override
    public String sleep(){
        setStatus(Status.SLEEP);
        return name + " sleeps";
    }
}
