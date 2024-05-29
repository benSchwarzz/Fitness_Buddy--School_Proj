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
    
    public void sort(String method) {
        ArrayList<Workout> w = new ArrayList<Workout>();
        
        if (method.equals("type")) {
            for (Workout i : this.workouts) {
                if (i.type == "Hypertrophy") {
                    w.add(i);
                }
            }
            for (Workout i : this.workouts) {
                if (i.type == "Strength") {
                    w.add(i);
                }
            }
            for (Workout i : this.workouts) {
                if (i.type == "Endurance") {
                    w.add(i);
                }
            }
            
            for (Workout i : w) {
                System.out.println(i);
            }
            
        } else if (method.equals("difficulty")) {
            Collections.sort(this.workouts, new Sort_by_difficulty());
            
        } else if (method.equals("date")) {
            
            
        } else if (method.equals("length")) {
            
        }
        for (Workout i : w) {
            System.out.println(i);
        }
    }
}
