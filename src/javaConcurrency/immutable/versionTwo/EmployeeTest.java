package javaConcurrency.immutable.versionTwo;

public class EmployeeTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Address address = new Address("Toshkent", "Muhbir 1");
        Employee employee = new Employee("Akbarov Akbar", 20, address);
        System.out.println(employee);
        System.out.println(employee);
        System.out.println(employee);

    }
}
