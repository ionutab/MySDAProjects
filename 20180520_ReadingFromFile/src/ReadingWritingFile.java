import java.io.*;
import java.util.Scanner;

public class ReadingWritingFile {

    public static void simpleReadingToInt(String inputFilePath) {

        System.out.println("simple reader");

        File file = new File(inputFilePath);

        try {
            FileReader fr = new FileReader(file);

            while (fr.ready()) {
                int c = fr.read();
                System.out.print(c);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println();
    }

    public static void readingUsingBufferedReader(String inputFilePath) {

        System.out.println("simple buffered file reader");

        File file = new File(inputFilePath);
        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            while (br.ready()) {
                String line = br.readLine();
                System.out.println(line);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println();
    }

    public static void readingUsingScanner(String inputFilePath) {
        System.out.println("reading using scanner");
        File file = new File(inputFilePath);

        try {
            Scanner scanner = new Scanner(file);

            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }

        } catch (FileNotFoundException e) {
            System.out.println("File does not exist");
        }

    }

    public static void testMultipleFR(String inputFilePath) {
        System.out.println("test multiple filereaders");
        File file = new File(inputFilePath);

        int max = 10;

        try {
            FileReader fr1 = new FileReader(file);
            FileReader fr2 = new FileReader(file);

            BufferedReader br1 = new BufferedReader(fr1);
            BufferedReader br2 = new BufferedReader(fr2);


            int i = 0;
            int j = 0;
            while (i < max && br1.ready()) {
                br1.readLine();
                while (j < max && br2.ready()) {
                    br2.readLine();
                    j++;
                }
                i++;
            }

            System.out.println(" using fileinput stream ");

            FileInputStream fileInputStream1 = new FileInputStream(file);
            FileInputStream fileInputStream2 = new FileInputStream(file);

            int k = 0;
            int l = 0;
            int c1, c2;
            while ((c1 = fileInputStream1.read()) != -1 && k < max) {
                System.out.println(c1);
                while ((c2 = fileInputStream2.read()) != -1 && l < max) {
                    System.out.println(c2);
                    l++;
                }
                k++;
            }

            InputStreamReader inputStreamReader1 = new InputStreamReader(fileInputStream1);
            InputStreamReader inputStreamReader2 = new InputStreamReader(fileInputStream2);

            inputStreamReader1.read();

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("File not found");
        }
    }

    public static void main(String[] args) {
        // write your code here

        String inputFilePath = "input.txt";
        simpleReadingToInt(inputFilePath);
        readingUsingBufferedReader(inputFilePath);
        readingUsingScanner(inputFilePath);

        testMultipleFR(inputFilePath);
    }
}
