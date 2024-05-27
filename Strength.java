import java.util.Date;

public class Strength extends Workout
{
    byte weight_adjustment;
    String location;
    
    public Strength(Date a, int b, byte c, byte d, String e) {
        super(a, b, c, "Strength");
        this.weight_adjustment = d;
        this.location = e;
    }
}
