package withIO_NIO.codeUz_lessons;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderExample {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("review/io/file.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);

       /* String line = bufferedReader.readLine();
        System.out.println(line);
        System.out.println(line);*/

        String line1;
        while ((line1 = bufferedReader.readLine()) != null) {
            System.out.println(line1);
        }

       /* int n = bufferedReader.read();
        while ((n=bufferedReader.read())!=-1){
            System.out.println((char) n);
        }*/
        bufferedReader.close();
    }
}
