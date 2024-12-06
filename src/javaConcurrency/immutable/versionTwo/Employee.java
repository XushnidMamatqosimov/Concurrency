package javaConcurrency.immutable.versionTwo;

public class Employee {
    private final String fullName;
    private final Integer age;
    private final Address address;

    public Employee(String fullName, Integer age, Address address){
        this.fullName = fullName;
        this.age = age;
        this.address = address;
    }

    public String getFullName() {
        return fullName;
    }

    public Integer getAge() {
        return age;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "fullName='" + fullName + '\'' +
                ", age=" + age +
                ", address=" + address +
                '}';
    }
}
