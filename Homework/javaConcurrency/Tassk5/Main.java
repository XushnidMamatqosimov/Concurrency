package javaConcurrency.Tassk5;

public class Main {
    public static void main(String[] args) {
        Salary salary = new Salary(7000000L, 500000L, 90000000);
        Worker worker = new Worker("Abdullayev Abdulla", 32, salary);
        System.out.println(worker);
        System.out.println("Annual salary : " + salary.getYearlySalary());
        System.out.println("Monthly salary : " + salary.getSalary());
        System.out.println("Receive bonus for working hardly : " + salary.getBonus());

        System.out.println("-------------------------------------------------->");

        Salary salary1 = new Salary(3000000L, 200000L, 38400000);
        Worker worker1 = new Worker("Teshayev Tesha", 24, salary1);
        System.out.println(worker1);
        System.out.println("Annual salary : " + salary.getYearlySalary());
        System.out.println("Monthly salary : " + salary.getSalary());
        System.out.println("Receive bonus for working hardly : " + salary.getBonus());
    }
}
