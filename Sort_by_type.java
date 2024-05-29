import java.util.*;

public class Sort_by_type implements Comparator<Workout>
{
    public int compare(Workout x, Workout y) {
        return x.type.compareTo(y.type);
    }
}