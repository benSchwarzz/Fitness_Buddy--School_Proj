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
    
    public String toString() {
        String txt = "Date: " + this.date + "\nLength: " + this.length + "\nDifficulty: " + this.difficulty + "\nType: Hypertrophy \nWeight Adjustment: " + this.weight_adjustment + "\nLocation: " + this.location;
        
        return txt;
    }
}
