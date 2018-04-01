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

    }

}
