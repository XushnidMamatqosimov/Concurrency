package withIO_NIO.codeUz_lessons;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;

public class FileInputStreamExample {
    public static void main(String[] args) throws IOException {
      /*  FileInputStream fileInputStream = new FileInputStream("review/io/output.txt");
        int read = fileInputStream.read();
        System.out.println((char)read);
        while ((read=fileInputStream.read())!=-1){
            System.out.println((char)read);
        }

        fileInputStream.close();*/

        Path path = Path.of("review/io/output.txt");
        System.out.println(path.getParent());
        System.out.println(path.getFileName());
    }
}
