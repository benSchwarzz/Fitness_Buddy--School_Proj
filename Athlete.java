import java.util.ArrayList;
import java.util.Date;
import java.util.*;

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
    
    public void mark_workout(Date d, int l, byte dif, float dist, int hr) {
        this.workouts.add(new Endurance(d, l, dif, dist, hr));
    }
    
    public void mark_workout(Date d, int l, byte dif, int v, String loc) {
        this.workouts.add(new Hypertrophy(d, l, dif, v, loc));
    }
    
    public void mark_workout(Date d, int l, byte dif, byte w, String loc) {
        this.workouts.add(new Strength(d, l, dif, w, loc));
    }
    
    public void log_workout(Workout w) {
        workouts.add(w);
    }
    
    public void sort(String method) {
        if (method.equals("type")) {
            Collections.sort(this.workouts, new Sort_by_type());

        } else if (method.equals("difficulty")) {
            Collections.sort(this.workouts, new Sort_by_difficulty());
            
        } else if (method.equals("date")) {
            Collections.sort(this.workouts, new Sort_by_date());
            
        } else if (method.equals("length")) {
            Collections.sort(this.workouts, new Sort_by_length());
            
        }
        
        for (Workout i : this.workouts) {
            System.out.println(i);
        }
    }
    
    public void offer_insight() {
        
    }
}





