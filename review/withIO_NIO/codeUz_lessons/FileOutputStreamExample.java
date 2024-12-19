package withIO_NIO.codeUz_lessons;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamExample {
    public static void main(String[] args) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("review/io/output.txt", true);
        fileOutputStream.write(65);

        fileOutputStream.flush();
        fileOutputStream.close();
    }
}
