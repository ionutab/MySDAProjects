import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MyFileWriter implements IDisplay {

    @Override
    public void display(String output) {

        File file = new File("src\\files\\output\\output" + System.currentTimeMillis() + ".txt");

        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(output);

            bufferedWriter.flush();

        } catch (IOException e){
            System.out.println("Cannot write to file.");
            System.out.println(e.toString());
        }

    }
}
