package withIO_NIO.codeUz_lessons;

import java.io.*;
import java.io.FileWriter;

public class PrintWriterExample {
    public static void main(String[] args) throws IOException {
        //todo: full explanation of creating PrintWriter:
        File file = new File("review/io/print.txt");
        FileWriter fileWriter = new FileWriter(file, true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        PrintWriter printWriter = new PrintWriter(bufferedWriter);

        //todo : Easy way of creating PrintWriter;
        PrintWriter printWriter1 = new PrintWriter("review/io/print.txt");
        printWriter.println("Salom Dostlar");
        printWriter.println(100);

        printWriter.flush();
        printWriter.close();


    }
}
