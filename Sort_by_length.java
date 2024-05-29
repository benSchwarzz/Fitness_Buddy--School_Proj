import java.util.*;

public class Sort_by_length implements Comparator<Workout>
{
    public int compare(Workout x, Workout y) {
        return y.length - x.length;
    }
}