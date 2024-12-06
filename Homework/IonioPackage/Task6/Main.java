package IonioPackage.Task6;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("fileNioDirect/task6.txt");
        Path write = Files.writeString(path, "hello Guys: " + "\n" + new Date());
        List<String> strings = Files.readAllLines(write);
        strings.forEach(System.out::println);
    }
}
