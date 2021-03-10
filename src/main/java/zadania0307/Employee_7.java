package zadania0307;

public class Employee_7 {
    private static int counter;
    private int id;
    private String name;
    private double salary;

    public Employee_7(String name, double salary) {
        this.id = counter++;
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee_7{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
