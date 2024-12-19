package withIO_NIO.examples;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        //withFileWriter();
        //withFileReader();

        //withBufferedWriter();
        //withBufferedReader();

        //printWriter();
        //printWriterWithBufferedReader();

        //withFileOutputStream();
        //withFileInputStream();


    }

    private static void withFileInputStream() throws IOException {
        FileInputStream fileInputStream = new FileInputStream("io/ex/input.txt");
        int read = fileInputStream.read();
        System.out.println((char) read);
        int n;
        while ((n = fileInputStream.read()) != -1) {
            System.out.println((char) n);
        }
        fileInputStream.close();
    }

    private static void withFileOutputStream() throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("io/ex/input.txt");
        fileOutputStream.write('a');
        String line = System.getProperty("line.separator");
        fileOutputStream.write(line.getBytes());
        fileOutputStream.write("salom".getBytes());
        fileOutputStream.close();
    }

    private static void printWriterWithBufferedReader() throws IOException {
        FileReader fileReader = new FileReader("io/ex/print.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        int read;

        while ((read = bufferedReader.read()) != -1) {
            System.out.println((char) read);
        }
    }

    private static void printWriter() throws FileNotFoundException {
        PrintWriter printWriter = new PrintWriter("io/ex/print.txt");
        printWriter.println("Hey guys this is PrintWriter Class message");
        printWriter.close();
    }

    private static void withBufferedReader() throws IOException {
        FileReader fileReader = new FileReader("io/ex/text.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String string = bufferedReader.readLine();
        System.out.println(string);

        bufferedReader.close();
    }

    private static void withBufferedWriter() throws IOException {
        FileWriter file = new FileWriter("io/ex/text.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(file);
        bufferedWriter.write("this is Buffered Writer class");
        bufferedWriter.flush();
        bufferedWriter.close();
    }

    private static void withFileReader() throws IOException {
        File file = new File("review/withIO_NIO/examples/nio/text.txt");
        FileReader fileReader = new FileReader(file);
        int n;
        while ((n = fileReader.read()) != -1) {
            System.out.println((char) n);
        }
    }

    private static void withFileWriter() throws IOException {
        File file = new File("review/withIO_NIO/examples/nio/text.txt");
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write("salom how are you man");
        fileWriter.flush();
        fileWriter.close();
    }
}
