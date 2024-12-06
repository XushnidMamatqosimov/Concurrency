package ionioPackage.NIO.Path;

import java.nio.file.Path;

public class Main {
    public static void main(String[] args) {
       // Path path = Path.of("/home", "testfol1", "testfold2", "testfold3");
        Path path = Path.of("/home", "readme.txt");
        System.out.println(path.isAbsolute());
       // Path testfolder = path.resolve("testfolder");
        System.out.println(path);
         path = path.normalize().toAbsolutePath();
        System.out.println(path);
        System.out.println(path.getFileName());
        Path parent = path.getParent();
        System.out.println(parent);
        Path parent1 = parent.getParent();
        System.out.println(parent1.getParent());
        System.out.println(parent1.getParent());
        Path parent2 = parent1.getParent();
        System.out.println(path.getRoot());


    }
}
