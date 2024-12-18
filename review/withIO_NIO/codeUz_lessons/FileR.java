package withIO_NIO.codeUz_lessons;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileR {
    public static void main(String[] args) throws IOException {
        // todo: 1 - level Constructor;
        /*File file = new File("review/io/text.txt");
        FileReader fileReader = new FileReader(file);
        System.out.println(file.length());*/

       /* FileReader fileReader = new FileReader("review/io/text.txt");
        int read = fileReader.read();
        System.out.println((char) read);
        int read1 = fileReader.read();
        System.out.println((char) read1);
        read1 = fileReader.read();
        System.out.println((char) read1);
        while (read1 != -1) {
            System.out.print((char) read1);
            read1 = fileReader.read();

            if (read1 == -1){
                System.out.println(read1);
            }
        }
        fileReader.close();*/



        FileReader fileReader = new FileReader("review/io/text.txt");
        /*int n;
        while ((n = fileReader.read()) != -1) {
            System.out.print((char) n);
        }*/

       /* char [] chars = new char[10];
        int read = fileReader.read(chars);
        System.out.println(chars);*/

        //System.out.println(read);
        fileReader.close();

    }
}
