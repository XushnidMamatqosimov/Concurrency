package ionioPackage.dateInputOutputExampleStream;

import java.io.*;

public class Main {
    public static void main(String[] args) {
       // outputStream();

        inputStream();
    }

    private static void inputStream() {
        try (FileInputStream fileInputStream = new FileInputStream("io/dateoutputstream.txt");
             DataInputStream dataInputStream = new DataInputStream(fileInputStream)) {
            double readDouble = dataInputStream.readDouble();
            System.out.println("readDouble = " + readDouble);
            long readLong = dataInputStream.readLong();
            System.out.println("readLong = " + readLong);
            int readInt = dataInputStream.readInt();
            System.out.println("readInt = " + readInt);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void outputStream() {
        try (FileOutputStream fileInputStream = new FileOutputStream("io/dateoutputstream.txt");
             DataOutputStream dataOutputStream = new DataOutputStream(fileInputStream)) {
            dataOutputStream.writeDouble(12D);
            dataOutputStream.writeLong(123234234L);
            dataOutputStream.writeInt(2005);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
