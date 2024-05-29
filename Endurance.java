import java.util.Date;

public class Endurance extends Workout
{
    float distance;
    int avg_hr;
    
    public Endurance(Date a, int b, byte c, float d, int e) {
        super(a, b, c, "Endurance");
        this.distance = d;
        this.avg_hr = e;
    }
    
    public String toString() {
        String txt = "Date: " + this.date + "\nLength: " + this.length + "\nDifficulty: " + this.difficulty + "\nType: Endurance \nDistance: " + this.distance + "\nAverage HR: " + this.avg_hr + "\n---------------------------------------*";
        
        return txt;
    }
}