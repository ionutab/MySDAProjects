package comparators;

import movie.Movie;

import java.util.Comparator;

public class MovieRatingComparator implements Comparator<Movie> {
    @Override
    public int compare(Movie o1, Movie o2) {
        if(o1.rating < o2.rating){
            return -1;
        } else if(o1.rating > o2.rating){
            return 1;
        } else {
            return 0;
        }

    }
}
