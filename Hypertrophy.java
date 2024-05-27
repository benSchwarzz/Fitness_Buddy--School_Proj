import java.util.Date;

public class Hypertrophy extends Workout
{
    int volume;
    String location;
    
    public Hypertrophy(Date a, int b, byte c, int d, String e) {
        super(a, b, c, "Hypertrophy");
        this.volume = d;
        this.location = e;
    }
}
