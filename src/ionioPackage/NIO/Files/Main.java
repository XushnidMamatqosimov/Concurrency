package ionioPackage.NIO.Files;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("io/readme.txt");
        /*String readString = Files.readString(path);
        System.out.println(readString);*/

       /* List<String> x = Files.readAllLines(path);
        x.forEach(System.out::println);*/
        //Path path1 = Path.of("io","readme2.txt");
       /* Files.writeString(path1, "Hello Xushnid:"+new Date()+"\n", StandardOpenOption.APPEND);*/
       /* Files.createFile(Path.of("nio", "readme2.txt"));

        Path dirs = Path.of("nio", "f1", "f2", "f3");
        if (!Files.exists(dirs)) {
            Files.createDirectories(dirs);

        }
        Path resolve = dirs.resolve("readme9.txt");
        Files.createFile(resolve);*/

        /*Path source = Path.of("io/readme2.txt");
        Path target = Path.of("nio/f1/f2/ copy.txt");
        Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);*/

        Path walkPath = Path.of("/Users/xushnid/Documents/Java Prog/OOP Module/Concurrency");
        for (Path path1 : Files.walk(walkPath).toList()) {
           // if (Files.isRegularFile(path1)) {
                System.out.println(path1);
            //}
        }


    }
}
