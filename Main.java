import java.util.Scanner;
import java.util.ArrayList;
import java.util.Date;

public class Main
{
    public static void main(String[] args) {
        System.out.print('\u000C');
        
        Hypertrophy w1 = new Hypertrophy(new Date(2024, 6, 15, 0, 0, 0), 70, (byte) 9, 18, "goodlife");
        Endurance w2 = new Endurance(new Date(2024, 7, 15, 0, 0, 0), 50, (byte) 8, 5F, 140);
        Strength w3 = new Strength(new Date(2024, 5, 15, 0, 0, 0), 60, (byte) 12, (byte) 5, "goodlife");
        ArrayList<Workout> workouts = new ArrayList<Workout>();
        
        Athlete x = new Athlete("Ben Schwarz", (byte) 17, workouts);
        x.mark_workout(new Date(2024, 6, 15, 0, 0, 0), 70, (byte) 9, 18, "goodlife");
        x.mark_workout(new Date(2024, 7, 15, 0, 0, 0), 50, (byte) 8, 5F, 140);
        x.mark_workout(new Date(2024, 5, 15, 0, 0, 0), 60, (byte) 12, (byte) 5, "goodlife");
        
        x.sort("type");
    }
}
