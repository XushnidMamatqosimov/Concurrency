package IonioPackage.Task3;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Student implements Externalizable {
    private String fullName;
    private int age;
    private String password;

    public Student(String fullName, int age, String password) {
        this.fullName = fullName;
        this.age = age;
        this.password = password;
    }

    public Student() {
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(this.fullName.substring(0,5));
        out.writeObject(this.password.substring(5));
        out.writeObject(this.age);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
       this.fullName = (String) in.readObject();
       this.password = (String) in.readObject();
       this.age = (int) in.readObject();
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Student{" +
                "fullName='" + fullName + '\'' +
                ", age=" + age +
                ", password='" + password + '\'' +
                '}';
    }
}
