package IonioPackage.Task7;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("fileNioDirect/buffer.txt");
        Path fileForCheck = Files.writeString(path, "Bu qoshimcha file tekshirish uchun", StandardOpenOption.APPEND);
        // Path path1 = Files.writeString(path, "Happy new 2025\n" +"End of 2024");

        List<String> strings = Files.readAllLines(path);
        strings.forEach(System.out::println);


    }
}
