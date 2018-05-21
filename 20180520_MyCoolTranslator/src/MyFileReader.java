import java.io.*;

public class MyFileReader implements IReader {

    @Override
    public String read() {
        String input = "";

        File file = new File("src\\files\\input\\input.txt");

        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while(bufferedReader.ready()){
                String line = bufferedReader.readLine();
                input = input.concat(line);
                input = input.concat("\n");
            }

        } catch (FileNotFoundException e){
            System.out.println("File not found");
            System.out.println(e.toString());
            return null;
        } catch (IOException e){
            System.out.println("Cannot read from file.");
            System.out.println(e.toString());
            return null;
        }

        System.out.println("Original file contents are:");
        System.out.println(input);

        return input;
    }
}
