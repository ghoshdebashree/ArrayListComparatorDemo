import java.util.Comparator;

public class MakeYearComparator implements Comparator<Vehicle> {
    @Override
    public int compare(Vehicle v1, Vehicle v2) {
        return v1.makeYear.compareTo(v2.makeYear);
    }
}
