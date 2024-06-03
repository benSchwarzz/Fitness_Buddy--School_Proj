import java.util.*;

public class Insight
{
    String 
        insight1 = "Give yourself more time to rest. Your body needs to recover",
        insight2 = "Try to fill in some of your rest time",
        insight3 = "Shorten your workouts to avoid overworking yourself",
        insight4 = "Hard workouts are great, but not too often. Otherwise you will be prone to injuries",
        insight5 = "Try doing a variety of different type of workouts. This will allow you to be more well rounded",
        insight6 = "Not enough workouts logged to make an astute judgement";
    ArrayList<Workout> workouts;
           
    public ArrayList<String> Insight(ArrayList<Workout> w) {
        this.workouts = w;
        ArrayList<String> insights = new ArrayList<String>();
        
        if (this.workouts.size() > 4) {
            ///////////////////////////////////////////////////////////
            float end_percent = 0F;
            float hyp_percent = 0F;
            float str_percent = 0F;
            for (Workout i : this.workouts) {
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
            end_percent /= this.workouts.size();
            hyp_percent /= this.workouts.size();
            str_percent /= this.workouts.size();
            
            if (end_percent > 50 || hyp_percent > 50 || str_percent > 50) {
                insights.add(insight5);
            }
            //////////////////////////////////////////////////////////////
            float avg_dif = 0;
            
            for (Workout i : this.workouts) {
                avg_dif += i.difficulty;
            }
            
            avg_dif /= this.workouts.size();
            
            if (avg_dif > 7) {
                insights.add(insight4);
            }
            ////////////////////////////////////////////////////////////////
            float avg_len = 0;
            
            for (Workout i : this.workouts) {
                avg_len += i.length;
            }
            
            avg_len /= this.workouts.size();
            
            if (avg_len > 75) {
                insights.add(insight3);
            }
            ////////////////////////////////////////////////////////////////
            
            
        } else {
            insights.add(insight6);
        }
        
        return insights;
    }
}