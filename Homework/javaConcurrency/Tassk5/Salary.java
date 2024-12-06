package javaConcurrency.Tassk5;

public final  class Salary {
    private final Long salary;
    private final Long bonus;
    private final Integer yearlySalary;

    public Salary(Long salary, Long bonus, Integer yearlySalary) {
        this.salary = salary;
        this.bonus = bonus;
        this.yearlySalary = yearlySalary;
    }

    public Long getSalary() {
        return salary;
    }

    public Long getBonus() {
        return bonus;
    }

    public Integer getYearlySalary() {
        return yearlySalary;
    }

    @Override
    public String toString() {
        return "Salary{" +
                "salary=" + salary +
                ", bonus=" + bonus +
                ", yearlySalary=" + yearlySalary +
                '}';
    }
}
