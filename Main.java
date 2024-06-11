// This is the user interface for the entire program. This is where the program will run

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Date; // to record and compare dates

public class Main
{
    public static void main(String[] args) throws InterruptedException { // The throw statement is meant to compensate for the Thread.sleep() function used to sleep the program
        
        Scanner in = new Scanner(System.in);
        System.out.print('\u000C');
        
        // Variables //
        byte com_line_1;
        byte com_line_2;
        byte month;
        byte day;
        byte hour;
        byte min;
        int length;
        byte difficulty;
        byte type;
        int x;
        int y;
        String y_;
        //---------------//
        
        // Initial Setup //
        System.out.println("Welcome to FitnessBuddy! In order to get started, please enter the following information");
        System.out.print("Enter Name: ");
        String name = in.nextLine();
        System.out.print("Enter Age: ");
        byte age = in.nextByte();
        Athlete ath = new Athlete(name, age);
        //---------------//
        
        boolean run = true;
        while (run) {
            try { // This try catch function simply catches any kind of error that may happen at any point and brings you back to the home page
                // Home page message and wait for input //
                System.out.print('\u000C');
                System.out.println("The following are the commands\n(1) Log a workout\n(2) Sort past workouts\n(3) Request Insights\n(4) Quit\nCurrently, you have logged a total of " + ath.workouts.size() + " workouts");
                System.out.print("Command: ");
                com_line_1 = in.nextByte();
                in.nextLine();
                
                Thread.sleep(500);
                //---------------//
                
                if (com_line_1 == 1) { // Log a workout
                    
                    System.out.print('\u000C');
                    
                    System.out.print("Type ((1)Endurance, (2)Hypertrophy, (3)Strength): ");
                    type = in.nextByte();
                    
                    // Date
                    System.out.println("-- Date --");
                    System.out.print("Month: ");
                    month = in.nextByte();
                    System.out.print("Day: ");
                    day = in.nextByte();
                    System.out.print("Hour: ");
                    hour = in.nextByte();
                    System.out.print("Minute: ");
                    min = in.nextByte();
                    
                    Date date = new Date(2024, month + 1, day, hour, min); // For the purpose of user efficiency, we can assume it's year 2024
                    
                    System.out.print("Length (in minutes): ");
                    length = in.nextInt();
                    
                    System.out.print("Difficulty (ease: 1 to hard: 10): ");
                    difficulty = in.nextByte();
                    if (difficulty > 10) {
                        difficulty = 10;
                    } else if (difficulty < 1) {
                        difficulty = 1;
                    }
                    
                    // Type specific information
                    if (type == 1) {
                        System.out.print("Distance (km): ");
                        x = in.nextInt();
                        System.out.print("Average HR: ");
                        y  = in.nextInt();
                        
                        ath.mark_workout(date, length, difficulty, x, y); // Overloaded function
                        System.out.print("Your endurance workout has been logged");
                    } else if (type == 2) {
                        System.out.print("Volume: ");
                        x = in.nextInt();
                        in.nextLine();
                        System.out.print("Location: ");
                        y_ = in.nextLine();
                        
                        ath.mark_workout(date, length, difficulty, x, y_); // Overloaded function
                        System.out.print("Your hypertrophy workout has been logged");
                    } else if (type == 3) {
                        System.out.print("Weight Adjustment: ");
                        x = in.nextByte(); 
                        in.nextLine();
                        System.out.print("Location: ");
                        y_ = in.nextLine();
                        
                        ath.mark_workout(date, length, difficulty, x, y_); // Overloaded function
                        System.out.print("Your strength workout has been logged");
                    } else {
                        System.out.print("Invalid type: please try again"); // If it's invalid input the workout is trashed and you must restart
                    }
                    
                } else if (com_line_1 == 2) { // Show past workouts
                
                    if (ath.workouts.size() > 0) { // Make sure user has enough workouts logged
                        System.out.print("How would you like your workouts to be sorted ((1) Type, (2) Date, (3) Difficulty, (4) Length): ");
                        byte sort = in.nextByte();
                        in.nextLine();
                        switch (sort) {
                            case 1: ath.sort("type"); break;
                            case 2: ath.sort("date"); break;
                            case 3: ath.sort("difficulty"); break;
                            case 4: ath.sort("length"); break;
                            default: System.out.println("Please try again");
                        }
                        
                        
                        System.out.print("Hit Enter to go back Home"); // Wait for user to be done before returning to home page
                        String next = in.nextLine();
                        
                    } else {
                        System.out.println("Not enough workouts logged");
                        Thread.sleep(500);
                    }
                    
                } else if (com_line_1 == 3) { // Request insights
                    new Insight(ath);
                    
                    System.out.print("Hit Enter to go back Home"); // Wait for user to be done before returning to home page
                    String next = in.nextLine();
                    
                } else if (com_line_1 == 4) { // Quit
                    run = false;
                } else {
                    System.out.println("Invalid Entry: please try again");
                }
            } catch (Exception e) {
                    System.out.println("Exception caught");
                    Thread.sleep(500);
                    in.nextLine(); // Clear the scanner object so the same error doesn't continue to happen in a loop
            }
        }
    }
}