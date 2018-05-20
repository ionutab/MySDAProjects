import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String input;
        String output = new String();
        System.out.println("Please input your message: ");
        Scanner scanner = new Scanner(System.in);
        input = scanner.nextLine();
        input = input.toLowerCase();
        System.out.println("Original message is:");
        System.out.println(input);
        MorseCode morseCode = new MorseCode();
        for (int i = 0; i < input.length(); i++) {
            char x = input.charAt(i);
            String c =  String.valueOf(x);
            String o = MorseCode.MORSE_CODE.get(c);
            if ( o == null) {
                o = " ";
            }
            output = output.concat(o);
        }
        System.out.println(" Transalated text: ");
        System.out.println(output);

    }

}
