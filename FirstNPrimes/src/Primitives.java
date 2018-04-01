public class Primitives {

    public void printHW(){
        System.out.print("Hello non static");
    }
    static char c = 'c';

    public static void printChar(){
        System.out.println(c);
        char c1 = (char)(c + 1);
        System.out.println(c1);
    }

    public static void printASCII(){
        for(short i = 0; i < 512; i++){
            char c = (char)i;
            System.out.println(i + " " + c);
        }
    }

    public static void filterNumbers(String s){
        //48 - 57

    }

    public static void main(String[] args){

//        for(int i = 0; i < args.length; i++){
//            String s = args[i];
//            for(int j = 0; j < s.length(); j++){
//                char c = s.charAt(j);
//                System.out.print((int)c + " ");
//            }
//            System.out.println();
//        }

//        /*2 oct*/
        short s = 32423;
//        /*4 oct*/
//        int i = 534247;
//        /*8 oct*/
        long l = 934567456343534L;

        System.out.println(s);
//        System.out.println(i);
        System.out.println(l);

//        long l2 = (long)i;
//        System.out.println(l2);

        long l3 = (long)s;
        System.out.println(l3);

        int i1 = (int)l;
        System.out.println(i1);

        long l4 = 2147483647;
        System.out.println((int)l4);
        long l5 = 2147483647 + 1;
        System.out.println((int)l5);

        short s2 = 32767;
        System.out.println(s2);
        System.out.println((short)(s2 + 1));
        System.out.println(Integer.toBinaryString(s2));
        System.out.println(Integer.toBinaryString((short)(s2 + 1)));

//        s2 = s2 >> 1;
        System.out.println(Integer.toBinaryString(121));
        System.out.println(Integer.toBinaryString(121 >> 1));

        System.out.println(Integer.toBinaryString(121 >> 2));
        System.out.println(Integer.toBinaryString(121 >> 3));
        System.out.println(Integer.toBinaryString(121 << 1));
        System.out.println(Integer.toBinaryString(121 << 2));
        System.out.println(Integer.toBinaryString(121 << 3));


        Integer m = 6;
        Integer z = new Integer(7);
        n = z;
        z = m;

        Long lll = 6L;
        long ll2 = 6;
//        int iii = 6L;
//        Integer ii3 = 6L;
//        Integer iz = 87575;
//
//        String[] strings = new String[4];
//        strings[0] = iz.toString();
//        strings[1] = String.valueOf(iz);
//        strings[2] = String.valueOf(n);
//
//        String s4 = (String)34345;


        int n = 5;
        int i = 0;
        while (i < n) {
            testPrime(i);

            i++;
        }

        int m = 20;

        for(int i = n; i < m; i++){

            testPrime(i);
        }




    }
}
