package movie;

public class MovieImmutability {

    public static void testImmutability(){

        Movie m1 = new Movie("Star Wars", 1977, 9.00);
        Movie m2 = new Movie("Star Wars", 1977, 9.00);

        System.out.println(m1);
        System.out.println(m2);

        System.out.println(m1 == m2);
        System.out.println(m1.equals(m2));

        System.out.println("-------------------");

        SpecialMovie sm1 = new SpecialMovie("Star Wars", 1977, 9.00);
        SpecialMovie sm2 = new SpecialMovie("LOTR", 1999, 9.00);
        SpecialMovie sm3 = new SpecialMovie("LOTR 2", 1999, 9.00);

        System.out.println(sm1);
        System.out.println(sm2);
        System.out.println(sm3);

        System.out.println(sm1 == sm2);
        System.out.println(sm1.equals(sm2));
        System.out.println(sm2 == sm3);
        System.out.println(sm2.equals(sm3));

    }

}
