package withIO_NIO.codeUz_lessons;

import java.io.IOException;

public class FileWriter {
    public static void main(String[] args) throws IOException {
       /* FileWriter fileWriter = new FileWriter("review/io/text.txt");
        fileWriter.write('m');
        fileWriter.write(66);
      //  fileWriter.write("\n");
        String line = System.getProperty("line.separator");
        fileWriter.write(line);
        fileWriter.write("Salom");
        fileWriter.write(line);
        char [] c = new char[]{'a','b', 'c', 'd', 'e', 'f'};
        fileWriter.write(c);
        fileWriter.write(line);
        fileWriter.write("123456789", 1, 4);
        fileWriter.write(line);
        fileWriter.write(c, 2, 3);
        fileWriter.flush();
        fileWriter.close();*/

        // todo: 2- level Constructor;
        /*File file = new File("review/io/text.txt");
        FileWriter fileWriter = new FileWriter(file);*/
        java.io.FileWriter fileWriter = new java.io.FileWriter("review/io/text.txt", true);
        fileWriter.write("Nothing");
        String line = System.getProperty("line.separator");
        fileWriter.write(line);
        fileWriter.write("hello");
        fileWriter.close();
    }
}
