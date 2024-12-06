package javaConcurrency.immutable.versionOne;

public class Employee {
    private final String fullName;
    private final Integer age;
    private final Address address;

    public Employee(String fullName, Integer age, Address address) throws CloneNotSupportedException {
        this.fullName = fullName;
        this.age = age;
        this.address = (Address) address.clone();
    }

    public String getFullName() {
        return fullName;
    }

    public Integer getAge() {
        return age;
    }

    public Address getAddress() throws CloneNotSupportedException {
        return (Address) address.clone();
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
