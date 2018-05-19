import movie.MovieImmutability;

public class Main {

    public static void main(String[] args) {

        /*
        * Basic String immutability examples
        * */
        StringImmutabiltyUtils.testImmutability();
        /*
        * Obejct immutability using .equals
        * */
        MovieImmutability.testImmutability();
        /*
        *Collections operations
        * */
        CollectionTests.testCollections();
        /*
        * TreeSet without natural order, only using Comparator
        * */
        CollectionTests.testCollections2();
        /*
        * Basic Map examples
        * */
        MapsTests.testMaps();
    }
}
