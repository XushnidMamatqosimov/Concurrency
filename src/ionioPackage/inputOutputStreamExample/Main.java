package ionioPackage.inputOutputStreamExample;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        //inputStream();

        try (InputStream is = new FileInputStream("io/readme.txt");
             OutputStream os = new FileOutputStream("io/readme2.txt")) {
            is.transferTo(os);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void inputStream() {
        try (InputStream is = new FileInputStream("io/readme.txt")) {
            byte[] bytes = is.readAllBytes();
            String data = new String(bytes);
            System.out.println("data = " + data);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
