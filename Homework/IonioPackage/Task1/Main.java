package IonioPackage.Task1;

import java.io.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        // writer();
        File file = new File("fileNioDirect", "readme.txt");
        try (FileReader fileReader = new FileReader(file)) {
            StringBuffer a = new StringBuffer();
            int i;
            while ((i = fileReader.read()) != -1) {
                a.append((char) i);
            }
            System.out.println(a);
          /*  int read = fileReader.read();
            System.out.println((char) read);*/
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void writer() {
        File file = new File("fileNioDirect", "readme.txt");
        try (FileWriter fileWriter = new FileWriter(file)) {
            fileWriter.write("Hello Xushnid\n");
            fileWriter.write("I am your Supporter\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
