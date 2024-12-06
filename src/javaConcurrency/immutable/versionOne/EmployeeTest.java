package javaConcurrency.immutable.versionOne;

public class EmployeeTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Address address = new Address("Toshkent", "Muhbir 1");
        Employee employee = new Employee("Akbarov Akbar", 20, address);
        System.out.println(employee);
        address.setRegion("Jizzakh");
        System.out.println(employee);
        employee.getAddress().setRegion("Buxoro");
        System.out.println(employee);

    }
}
