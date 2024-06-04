import java.util.Scanner;
import java.util.ArrayList;
import java.util.Date;

public class Main
{
    public static void main(String[] args) throws InterruptedException {
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
            System.out.println("The following are the commands\n(1) Log a workout\n(2) Sort past workouts\n(3) Request Insights\n(4) Quit\nCurrently, you have logged a total of " + ath.workouts.size() + " workouts");
            System.out.print("Command: ");
            com_line_1 = in.nextByte();
            in.nextLine();
            
            Thread.sleep(500);
        
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
                
                
                if (type.equals("endurance")) {
                    System.out.print("Distance: ");
                    int x = in.nextInt();
                    System.out.print("Average HR");
                    int y  = in.nextInt();
                    
                    ath.mark_workout(date, length, difficulty, x, y);
                    System.out.print("Your endurance workout has been logged");
                } else if (type.equals("hypertrophy")) {
                    System.out.print("Volume: ");
                    int x = in.nextInt();
                    in.nextLine();
                    System.out.print("Location: ");
                    String y = in.nextLine();
                    
                    ath.mark_workout(date, length, difficulty, x, y);
                    System.out.print("Your hypertrophy workout has been logged");
                } else if (type.equals("strength")) {
                    System.out.print("Weight Adjustment: ");
                    byte x = in.nextByte();
                    System.out.print("Location: ");
                    String y = in.nextLine();
                    
                    ath.mark_workout(date, length, difficulty, x, y);
                    System.out.print("Your strength workout has been logged");
                } else {
                    System.out.print("Invalid type: please try again");
                }
                
                
            } else if (com_line_1 == 2) { // Show past workouts
                if (ath.workouts.size() > 0) {
                    System.out.print("How would you like your workouts to be sorted: ");
                    String sort = in.nextLine().toLowerCase();
                    ath.sort(sort);
                    
                    System.out.print("Hit Enter to go back Home");
                    String next = in.nextLine();
                    
                } else {
                    System.out.println("Not enough workouts logged");
                    Thread.sleep(500);
                }
                
            } else if (com_line_1 == 3) { // Request insights
                new Insight(ath);
                
                System.out.print("Hit Enter to go back Home");
                String next = in.nextLine();
                
            } else if (com_line_1 == 4) { // Quit
                run = false;
            } else {
                System.out.println("Invalid Entry: please try again");
            }
        }
    }
}
