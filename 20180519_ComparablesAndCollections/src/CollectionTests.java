import comparators.MovieNameComparator;
import comparators.MovieRatingComparator;
import comparators.MovieYearComparator;
import comparators.SpecialMovieNameComparator;
import movie.Movie;
import movie.SpecialMovie;

import java.util.*;

public class CollectionTests {

    public static void printCollection(Collection<Movie> movies){
        for(Movie movie : movies){
            System.out.println(movie);
        }
        System.out.println("size: " + movies.size());
    }

    public static void printSpecialMovies(Collection<SpecialMovie> movies){
        for(SpecialMovie movie : movies){
            System.out.println(movie);
        }
        System.out.println("size: " + movies.size());
    }

    public static void removeMoviesAfter2000(Collection<Movie> movies){
        Iterator iterator = movies.iterator();

        while(iterator.hasNext()){
            Movie movie = (Movie)iterator.next();
            if(movie.year >= 2000){
                System.out.println(movie + " will be removed" );
                iterator.remove();
            }
        }
    }

    public static void testCollections(){

        Movie m1 = new Movie("Star Wars", 1977, 9.00);
        Movie m2 = new Movie("LOTR", 1999, 9.00);
        Movie m3 = new Movie("Blade Runner 2049", 2018, 9.00);
        Movie m4 = new Movie("Silence of the Lambs", 1992, 10.00);
        Movie m5 = new Movie("Seven", 1984, 10.00);
        Movie m6 = new Movie("2001: A space Oddisey", 1967, 9.50);

        System.out.println("Testing a collection with initial capacity:");
        Collection<Movie> myMovies1 = new ArrayList<Movie>(3);
        printCollection(myMovies1);
        myMovies1.add(m1);
        myMovies1.add(m2);
        myMovies1.add(m3);
        myMovies1.add(m4);

        System.out.println("The Collection has resized itself:");
        printCollection(myMovies1);

        System.out.println("Adding elements to a collection:");
        ArrayList<Movie> myMovies2 = new ArrayList<>();
        printCollection(myMovies2);
        myMovies2.add(myMovies2.size(), m1);
        printCollection(myMovies2);
        myMovies2.addAll(myMovies1);
        printCollection(myMovies2);
        myMovies2.set(1, m5);
        printCollection(myMovies2);

        System.out.println("Getting an element from a certain index:");
        System.out.println(myMovies2.get(3));

        System.out.println("Retaining and removing elements from collection:");
        myMovies2.retainAll(myMovies1);
        printCollection(myMovies2);
        myMovies2.remove(m2);
        printCollection(myMovies2);

        System.out.println("----- testing iterator ----");
        LinkedList<Movie> myMovies3 = new LinkedList<>();
        myMovies3.addAll(myMovies1);
        myMovies3.addAll(myMovies2);
        myMovies3.add(m6);
        printCollection(myMovies3);

        System.out.println("----- using iterator from removing movies after 2000 ");
        removeMoviesAfter2000(myMovies3);
        printCollection(myMovies3);

        System.out.println("--- compareTo");
        System.out.println("comparing " + m1 + " to " + m2);
        System.out.println(m1.compareTo(m2));

        System.out.println("Collection.sort");

        Collections.sort(myMovies3);
        printCollection(myMovies3);

        System.out.println("Collection.sort by movie name");
        Collections.sort(myMovies3, new MovieNameComparator());
        printCollection(myMovies3);
        System.out.println("Collection.sort by movie year");
        Collections.sort(myMovies3, new MovieYearComparator());
        printCollection(myMovies3);
        System.out.println("Collection.sort by movie rating");
        Collections.sort(myMovies3, new MovieRatingComparator());
        printCollection(myMovies3);



        System.out.println("----- sets with natural order ----");
        Set<Movie> movieTreeSet = new TreeSet<>();
        movieTreeSet.add(m6);
        movieTreeSet.add(m5);
        movieTreeSet.add(m3);
        movieTreeSet.add(m4);
        movieTreeSet.add(m5);
        printCollection(movieTreeSet);


        System.out.println("----- sets with custom order ----");
        Set<Movie> movieTreeSetCustomOrder = new TreeSet<>(new MovieYearComparator());
        movieTreeSetCustomOrder.add(m6);
        movieTreeSetCustomOrder.add(m5);
        movieTreeSetCustomOrder.add(m3);
        movieTreeSetCustomOrder.add(m4);
        movieTreeSetCustomOrder.add(m5);
        printCollection(movieTreeSetCustomOrder);

        System.out.println("--- queue ---");



    }

    public static void testCollections2(){
        SpecialMovie specialMovie1 = new SpecialMovie();
        specialMovie1.name = "abc";
        SpecialMovie specialMovie2 = new SpecialMovie();
        specialMovie2.name = "def";

        TreeSet<SpecialMovie> specialMovies = new TreeSet<>(new SpecialMovieNameComparator());
        specialMovies.add(specialMovie2);
        specialMovies.add(specialMovie1);
        printSpecialMovies(specialMovies);
    }


}
