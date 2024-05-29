import java.util.*;

public class Sort_by_difficulty implements Comparator<Workout>
{
    public int compare(Workout x, Workout y) {
        return x.difficulty - y.difficulty;
    }
}