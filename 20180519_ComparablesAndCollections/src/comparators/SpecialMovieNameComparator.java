package comparators;

import movie.SpecialMovie;

import java.util.Comparator;

public class SpecialMovieNameComparator implements Comparator<SpecialMovie> {

    @Override
    public int compare(SpecialMovie o1, SpecialMovie o2) {
        return o1.name.compareTo(o2.name);
    }
}
