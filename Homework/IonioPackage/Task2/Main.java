package IonioPackage.Task2;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Xushnid Mamatqosimov", 19, "xushnid1234");

        serilaizeQilish(student);

        deSerilazieQilish();
        System.out.println("Hello World");
    }

    private static void deSerilazieQilish() {
        try (FileInputStream fileInputStream = new FileInputStream("fileNioDirect/student.sr");
             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
            Student o = (Student) objectInputStream.readObject();
            System.out.println(o);
            System.out.println("Student Object Deserialized !!!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void serilaizeQilish(Student student) {
        try (FileOutputStream fileOutputStream = new FileOutputStream("fileNioDirect/student.sr");
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
            objectOutputStream.writeObject(student);
            System.out.println(student);
            System.out.println("Object serialized ");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
