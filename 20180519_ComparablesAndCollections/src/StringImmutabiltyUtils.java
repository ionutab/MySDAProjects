public class StringImmutabiltyUtils {

    public static void testImmutability(){

        // write your code here

        String s1 = new String("abc");
        String s2 = new String("abc");

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(System.identityHashCode(s1));
        System.out.println(System.identityHashCode(s2));

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

        s1 = "def";

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(System.identityHashCode(s1));
        System.out.println(System.identityHashCode(s2));

        System.out.println("-----------------------------");

        String s3 = "abc";
        String s4 = "abc";

        System.out.println(s3);
        System.out.println(s4);
        System.out.println(System.identityHashCode(s3));
        System.out.println(System.identityHashCode(s4));

        System.out.println(s3 == s4);
        System.out.println(s3.equals(s4));

        s3 = "def";

        System.out.println(s3);
        System.out.println(s4);
        System.out.println(System.identityHashCode(s3));
        System.out.println(System.identityHashCode(s4));

    }
}
