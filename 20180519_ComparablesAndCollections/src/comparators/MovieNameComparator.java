package comparators;

import movie.Movie;

import java.util.Comparator;

public class MovieNameComparator implements Comparator<Movie> {

    @Override
    public int compare(Movie o1, Movie o2) {
        return o1.name.compareTo(o2.name);
    }
}
