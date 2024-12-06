package javaConcurrency.Task4;

import java.util.ArrayList;
import java.util.List;

public class User {
    private int id;
    private String fullName;
    private int age;
    private String email;

    public User(int id, String fullName, int age, String email) {
        this.id = id;
        this.fullName = fullName;
        this.age = age;
        this.email = email;
    }

    public User() {
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }
}
