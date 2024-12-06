package IonioPackage.Task4;

import java.io.*;

public class Main {
    public static void main(String[] args) {
       // serilizshQilish();
        afterTrasientKeyWord();


    }

    private static void afterTrasientKeyWord() {
        try {
            Driver driver1 = new Driver("Alex", "AB1234556", "Vehicle");
            File file = new File("fileNioDirect/readme2.txt");
            FileInputStream fileInputStream = new FileInputStream(file);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            Driver o = (Driver)objectInputStream.readObject();
            System.out.println(o);
            System.out.println(driver1);

        } catch (IOException |ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void serilizshQilish() {
        try {
            Driver driver = new Driver("Alex", "AD123456", "Vehicle");
            File file = new File("fileNioDirect/readme2.txt");
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(driver);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
