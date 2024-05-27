import java.util.ArrayList;
import java.util.Date;

public class Athlete
{
    String name;
    byte age;
    ArrayList<Workout> workouts = new ArrayList<Workout>();
    
    public Athlete() {
        this.name = "N/A";
        this.age = 0;
    }
    
    public Athlete(String n, byte a, ArrayList<Workout> w) {
        this.name = n;
        this.age = a;
        this.workouts = w;
    }
    
    public Workout mark_workout(Date d, int l, byte dif, int dist, int hr) {
        Endurance x = new Endurance(d, l, dif, dist, hr);
        
        return x;
    }
    
    public Workout mark_workout(Date d, int l, byte dif, int v, String loc) {
        Hypertrophy x = new Hypertrophy(d, l, dif, v, loc);
        
        return x;
    }
    
    public Workout mark_workout(Date d, int l, byte dif, byte w, String loc) {
        Strength x = new Strength(d, l, dif, w, loc);
        
        return x;
    }
    
    public void log_workout(Workout w) {
        workouts.add(w);
    }
    
    public void 
}
