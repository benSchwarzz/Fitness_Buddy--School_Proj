import java.util.Date;

public class Workout
{
    Date date;
    int length;
    byte difficulty;
    String type = "Others";
    
    public Workout(Date d, int l, byte diff, String t) {
        this.date = d;
        this.length = l;
        this.difficulty = diff;
        this.type = t;
    }
    
    public String toString() {
        String txt = "Date: " + this.date + "\nLength: " + this.length + "\nDifficulty: " + this.difficulty + "\nType: none";
        
        return txt;
    }
}