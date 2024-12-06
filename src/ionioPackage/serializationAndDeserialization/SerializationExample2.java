package ionioPackage.serializationAndDeserialization;

import java.io.*;

public class SerializationExample2 {
    public static void main(String[] args) {
        write();
       // read();
    }

    private static void read() {
        try {
            Employee2 employee = new Employee2("Xushnid Mamatqosimov", 19, "+821021759119");
            File file = new File("serdeser", "file.txt");
            FileInputStream fileOutputStream = new FileInputStream(file);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileOutputStream);
            Employee2 o = (Employee2) objectInputStream.readObject();
            System.out.println(employee);
            System.out.println(o);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void write() {
        try {
            Employee2 employee = new Employee2("Xushnid Mamatqosimov", 19, "+821021759119");
            File file = new File("serdeser", "file.txt");
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(employee);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
