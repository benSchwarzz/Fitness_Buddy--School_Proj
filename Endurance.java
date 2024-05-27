import java.util.Date;

public class Endurance extends Workout
{
    int distance;
    int avg_hr;
    
    public Endurance(Date a, int b, byte c, int d, int e) {
        super(a, b, c, "Endurance");
        this.distance = d;
        this.avg_hr = e;
    }
}
