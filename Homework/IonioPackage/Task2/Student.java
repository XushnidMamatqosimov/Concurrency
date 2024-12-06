package IonioPackage.Task2;

import java.io.Serializable;

public class Student implements Serializable {
    private String fullName;
    private int age;
    private transient String password;

    public Student(String fullName, int age, String password) {
        this.fullName = fullName;
        this.age = age;
        this.password = password;
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
