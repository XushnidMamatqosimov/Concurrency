package withIO_NIO;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("io/text.txt");
        System.out.println(file.exists());
        System.out.println(file.isFile());

        //System.out.println(file.isDirectory());
        //System.out.println(file.exists());
    }
}
