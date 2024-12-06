package ionioPackage.file;

import java.io.File;
import java.io.IOException;

public class FileExample {
    public static void main(String[] args) throws IOException {
        File file = new File("io", "readme2.txt");
        System.out.println(file.delete());
       /* System.out.println(file.canExecute());
        System.out.println(file.isFile());
        System.out.println(file.isDirectory());
        if (!file.exists()) {
            file.createNewFile();
            System.out.println("file created");
        }*/

        File file1 = new File("io", "childPack/childPack2/childPack3");
        System.out.println(file1.mkdir());
        System.out.println(file1.mkdirs());
    }
}
