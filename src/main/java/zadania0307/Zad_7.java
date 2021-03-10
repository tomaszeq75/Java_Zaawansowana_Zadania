package zadania0307;

import java.util.*;
import java.util.stream.Collectors;

public class Zad_7 {
    public static void main(String[] args) throws NullPointerException {
        Employee_7 e1 = new Employee_7("Tomek", 100000);
        Employee_7 e2 = new Employee_7("Atomek", 5000);
        Employee_7 e3 = new Employee_7("Romek", 20000);

        List<Employee_7> employees = new ArrayList<>(Arrays.asList(e1, e2, e3));

        // zad 7
        Employee_7 ee = employees.stream()
                .filter(employee_7 -> employee_7.getSalary() > 30000)
                .findFirst()
                .get();

        System.out.println(ee);

        // zad 8
        List<Employee_7> sortedEmployees = new ArrayList<>();
        sortedEmployees = employees.stream()
                .sorted(Comparator.comparing(Employee_7::getName))
                .collect(Collectors.toList());

        System.out.println(sortedEmployees);

        // zad 9
        double sumOfSalary = employees.stream().reduce(0.0, (x, y) -> x + y.getSalary(), Double::sum);
        System.out.println(sumOfSalary);

        // 2 sposób
        sumOfSalary = employees.stream().mapToDouble(Employee_7::getSalary).reduce(0, Double::sum);
        System.out.println(sumOfSalary);

        // jeśli chodziło o max wynagrodzenie
        double maxSalary = employees.stream()
                .max((a, b) -> (int) (a.getSalary() - b.getSalary()))
                .get().getSalary();
        System.out.println(maxSalary);
    }
}
