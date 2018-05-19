package movie;

public class SpecialMovie{

    public String name;

    Integer year;

    Double rating;

    public SpecialMovie() {
    }

    public SpecialMovie(String name, Integer year, Double rating) {
        this.name = name;
        this.year = year;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "movie.SpecialMovie{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", rating=" + rating +
                '}';
    }

    public boolean equals(Object o){
        if(this == o) return true;
        SpecialMovie sm = (SpecialMovie)o;
        return this.rating.equals(sm.rating) && this.year.equals(sm.year);
    }

}
