import java.util.Scanner;

public class MySystemReader implements IReader {

    @Override
    public String read() {
        String input;
//        String output = new String();
        System.out.println("Please input your message: ");
        Scanner scanner = new Scanner(System.in);
        input = scanner.nextLine();
//        input = input.toLowerCase();
        System.out.println("Original message is:");
        System.out.println(input);
        return input;
    }
}
