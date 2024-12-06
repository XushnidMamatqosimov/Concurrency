package javaConcurrency.Tassk5;

public final class Worker {
    private final String fullName;
    private final Integer age;
    private final Salary salary;

    public Worker(String fullName, Integer age, Salary salary) {
        this.fullName = fullName;
        this.age = age;
        this.salary = salary;
    }

    public String getFullName() {
        return fullName;
    }

    public Integer getAge() {
        return age;
    }

    public Salary getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "fullName='" + fullName + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
