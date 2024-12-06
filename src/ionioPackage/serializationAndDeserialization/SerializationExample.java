package ionioPackage.serializationAndDeserialization;

import java.io.*;

public class SerializationExample {
    public static void main(String[] args) {
        //write();
        read();
    }

    private static void read() {
        try {
            Employee employee = new Employee("Xushnid Mamatqosimov", 19, "+821021759119");
            File file = new File("serdeser", "file.txt");
            FileInputStream fileOutputStream = new FileInputStream(file);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileOutputStream);
            Employee o =  (Employee)objectInputStream.readObject();
            System.out.println(employee);
            System.out.println(o);
        } catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }

    private static void write() {
        try {
            Employee employee = new Employee("Xushnid Mamatqosimov", 19, "+821021759119");
            File file = new File("serdeser", "file.txt");
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(employee);
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
