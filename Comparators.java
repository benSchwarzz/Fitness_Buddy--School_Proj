import java.util.*;

public class Sort_by_difficulty implements Comparator<Workout>
{
    public int compare(Workout x, Workout y) {
        return x.difficulty.compareTo(y.difficulty);
    }
}

public class Sort_by_type implements Comparator<Workout>
{
    public int compare(Workout x, Workout y) {
        return x.type.compareTo(y.difficulty);
}
