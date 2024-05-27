# Summative Proposal
## My Program
My program's purpose is to keep track of workouts. It will be capable of tracking info related to each workout indluding difficulty, type of workout, length, and more. It will also be capable of sorting workouts based on the quantitative data associated to each workout. Additionally, there is room for implementation of insights related to what could be done differently based on the info retrieved from the recorded workouts. 

## App Format
You will begin at the home page (com_line_1). From here, you will be given three options: (1) log a workout, (2) show me past workouts, and (3) request insights.
- (1) when logging a workout, you will be asked a series of questions including
  - date
  - length
  - type
    - if (type == endurance)
      - distance
      - avg_hr
    - if (type == hypertrophy)
      - volume
      - location (gym)
    - if (type == strength)
      - weight_increase
      - location (gym)
  - difficulty (0 to 10)
- (2) When sorting past workouts you will be asked how you want them to be sorted
  - by date
  - by length
  - by type
  - or by difficulty
    - hardest to easiest
    - easiest to hardest
- (3) When requesting insights the program will examine your workout history searching for unwanted patterns such as
  - to many hard workout and not enough rest
  - only one type of workout and not enough versatility
  - workouts are too long
  - not enough rest in between

## Program Structure
- Classes
  - Test/Client
  - Athlete
    - Name
    - Age
    - Workout history (ArrayList)
    - public Athlete(name, age, workout history);
    - public void sort(sorting method);
    - public String toString();
  - Workout (Super)
    - date
    - length
    - difficulty
    - type = "other";
    - Endurance/Cardiovascular (Sub)
      - type = "endurance";
      - distance*
      - avg_hr*
    - Hypertrophy (Muscle Growth) (Sub)
      - type = "hypertrophy";
      - volume
      - location (gym)
    - Strength (Sub)
      - type = "strength";
      - weight_adjustment
      - location (gym)
