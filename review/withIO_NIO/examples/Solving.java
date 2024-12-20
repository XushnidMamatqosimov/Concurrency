package withIO_NIO.examples;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Solving {
    public static void main(String[] args) {
        //fileWriterAndFileReader();
        // bufferedWriterAndBufferedReader();

        Path path = Paths.get("nio_example.txt");

        String content = "Hello, NIO";
        try {
            Files.write(path, content.getBytes());
            System.out.println("File created and written");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            String string = Files.readString(path);
            System.out.println("File content: " + string);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    private static void bufferedWriterAndBufferedReader() {
        String fileName = "buffered_example.txt";
        String content = "This is buffered IO.";

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName))) {
            bufferedWriter.write(content);
            System.out.println("Buffered read is completed");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void fileWriterAndFileReader() {
        String fileName = "io/ex/text.txt";
        String content = "Hello, Java IO!";

        try (FileWriter fileWriter = new FileWriter(fileName)) {
            fileWriter.write(content);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileReader fileReader = new FileReader(fileName)) {
            int ch;
            while ((ch = fileReader.read()) != -1) {
                System.out.println((char) ch);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
