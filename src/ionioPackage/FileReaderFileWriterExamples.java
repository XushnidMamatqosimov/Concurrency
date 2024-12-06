package ionioPackage;

import java.io.*;

public class FileReaderFileWriterExamples {
    public static void main(String[] args) {
      //  FileReader();

        File file = new File("io", "readme.txt");
        try (FileWriter fileWriter = new FileWriter(file, true)) {
           fileWriter.write("Mamatqosimov Xushnid\n");
           fileWriter.write("Hello World\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void FileReader() {
        File file = new File("io", "readme.txt");
        try (FileReader fileReader = new FileReader(file)) {
            StringBuilder a = new StringBuilder();
            int i;
            while ( (i = fileReader.read() )!= -1) {
                a.append((char) i);
            }
            System.out.println(a);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
