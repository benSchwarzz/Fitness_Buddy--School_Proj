import java.util.*;

public class Sort_by_date implements Comparator<Workout>
{
    public int compare(Workout x, Workout y) {
        return y.date.compareTo(x.date);
    }
}