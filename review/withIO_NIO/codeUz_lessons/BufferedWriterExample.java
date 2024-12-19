package withIO_NIO.codeUz_lessons;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterExample {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("review/io/file.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write(65);
        bufferedWriter.newLine();
        bufferedWriter.write("abcd");
        bufferedWriter.newLine();
        bufferedWriter.write(new char[]{'a','b','c','d'});
        bufferedWriter.newLine();

        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
