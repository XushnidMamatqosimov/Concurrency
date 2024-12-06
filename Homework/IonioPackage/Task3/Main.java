package IonioPackage.Task3;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        inputExternalization();
        outputExternalization();

    }

    private static void outputExternalization() {
        try {
            Student student = new Student("Mazgi Mazgiyev", 25, "mazgi");
            File file = new File("fileNioDirect/student.sr");
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(student);
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    private static void inputExternalization() throws IOException {
        try {

            Student student1 = new Student("Xushnid Mamatqosimov", 19, "qwerty");
            File file = new File("fileNioDirect/student.sr");
            FileInputStream fileInputStream = new FileInputStream(file);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            Object o = objectInputStream.readObject();
            System.out.println(o);
            System.out.println(student1);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
