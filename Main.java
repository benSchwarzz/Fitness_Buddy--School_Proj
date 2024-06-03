import java.util.Scanner;
import java.util.ArrayList;
import java.util.Date;

public class Main
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print('\u000C');
        
        byte com_line_1;
        byte com_line_2;
        
        System.out.println("Welcome Message");
        System.out.print("Enter Name: ");
        String name = in.nextLine();
        System.out.print("Enter Age: ");
        byte age = in.nextByte();
        Athlete ath = new Athlete(name, age);
        
        boolean run = true;
        while (run) {
            System.out.print('\u000C');
            System.out.println("Command Message");
            com_line_1 = in.nextByte();
            
            if (com_line_1 == 1) { // Log a workout
                System.out.print('\u000C');
                
                System.out.print("Type (Endurance, Hypertrophy, Strength): ");
                String type = in.nextLine().toLowerCase();
                
                // Date
                System.out.println("-- Date --");
                System.out.print("Month: ");
                byte month = in.nextByte();
                System.out.print("Day: ");
                byte day = in.nextByte();
                System.out.print("Hour: ");
                byte hour = in.nextByte();
                System.out.print("Minute: ");
                byte min = in.nextByte();
                
                Date date = new Date(2024, month, day, hour, min);
                
                System.out.print("Length (in minutes): ");
                int length = in.nextInt();
                
                System.out.print("Difficulty (ease: 1 to hard: 10): ");
                byte difficulty = in.nextByte();
                if (difficulty > 10) {
                    difficulty = 10;
                }
                
                boolean test = false;
                if (type.equals("endurance")) {
                    System.out.print("Distance: ");
                    int x = in.nextInt();
                    System.out.print("Average HR");
                    int y  = in.nextInt();
                    
                    ath.mark_workout(date, length, difficulty, x, y);
                    System.out.print("Your workout has been logged");
                } else if (type.equals("hypertrophy")) {
                    System.out.print("Volume: ");
                    int x = in.nextInt();
                    System.out.print("Location: ");
                    String y = in.nextLine();
                    
                    ath.mark_workout(date, length, difficulty, x, y);
                    System.out.print("Your workout has been logged");
                } else if (type.equals("strength")) {
                    System.out.print("Weight Adjustment: ");
                    byte x = in.nextByte();
                    System.out.print("Location: ");
                    String y = in.nextLine();
                    
                    ath.mark_workout(date, length, difficulty, x, y);
                    System.out.print("Your workout has been logged");
                } else {
                    System.out.print("Invalid type: please try again");
                }
                
                
            } else if (com_line_1 == 2) { // Show past workouts
                if (ath.workouts.size() > 0) {
                    System.out.print("How would you like your workouts to be sorted: ");
                    String sort = in.nextLine().toLowerCase();
                    ath.sort(sort);
                } else {
                    System.out.println("Not enough workouts logged");
                }
                
            } else if (com_line_1 == 3) { // Request insights
                
            } else if (com_line_1 == 4) { // Quit
                run = false;
            } else {
                System.out.println("Invalid Entry: please try again");
            }
        }
    }
}
