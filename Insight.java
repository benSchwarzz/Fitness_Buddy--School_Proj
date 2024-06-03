import java.util.*;
import java.util.Date;

public class Insight
{
    String 
        insight1 = "Give yourself more time to rest. Your body needs to recover",
        insight2 = "Try to fill in some of your rest time",
        insight3 = "Shorten your workouts to avoid overworking yourself",
        insight4 = "Hard workouts are great, but not too often. Otherwise you will be prone to injuries",
        insight5 = "Try doing a variety of different type of workouts. This will allow you to be more well rounded",
        insight6 = "Not enough workouts logged to make an astute judgement";
    Athlete athlete;
           
    public ArrayList<String> Insight(Athlete a) {
        this.athlete = a;
        ArrayList<String> insights = new ArrayList<String>();
        
        if (this.athlete.workouts.size() > 4) {
            /////////////////////////////////////////////////////////// Versatility
            float end_percent = 0F;
            float hyp_percent = 0F;
            float str_percent = 0F;
            for (Workout i : this.athlete.workouts) {
                if (i.type == "Endurance") {
                    end_percent += 1;
                }
                if (i.type == "Hypertrophy") {
                    hyp_percent += 1;
                }
                if (i.type == "Strength") {
                    str_percent += 1;
                }
            }
            end_percent /= this.athlete.workouts.size();
            hyp_percent /= this.athlete.workouts.size();
            str_percent /= this.athlete.workouts.size();
            
            if (end_percent > 70 || hyp_percent > 70 || str_percent > 70) {
                insights.add(insight5);
            }
            ////////////////////////////////////////////////////////////// Difficulty
            float avg_dif = 0;
            
            for (Workout i : this.athlete.workouts) {
                avg_dif += i.difficulty;
            }
            
            avg_dif /= this.athlete.workouts.size();
            
            if (avg_dif > 7) {
                insights.add(insight4);
            }
            //////////////////////////////////////////////////////////////// Length
            float avg_len = 0;
            
            for (Workout i : this.athlete.workouts) {
                avg_len += i.length;
            }
            
            avg_len /= this.athlete.workouts.size();
            
            if (avg_len > 75) {
                insights.add(insight3);
            }
            //////////////////////////////////////////////////////////////// Rest time
            athlete.sort("date");
            long rest;
            long avg_rest = 0;
            
            for (int i = 0; i < this.athlete.workouts.size(); i++) {
                rest = this.athlete.workouts.get(i).date.getTime() - this.athlete.workouts.get(i + 1).date.getTime();
                avg_rest += rest;
            }
            avg_rest /= this.athlete.workouts.size();
            
            if (avg_rest > 2 * 86400000) {
                insights.add(insight2);
            } else {
                insights.add(insight1);
            }
            
            
        } else {
            insights.add(insight6);
        }
        
        return insights;
    }
}