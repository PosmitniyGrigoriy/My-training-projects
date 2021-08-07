package ru.site.start.lesson30;

import java.util.List;
import java.util.function.Predicate;

public class HomeWork {

    public static void main(String[] args) {

        Employee employee1 = new Employee("Олег", "Бухгалтерия", 400);
        Employee employee2 = new Employee("Виктор", "Айти", 1200);
        Employee employee3 = new Employee("Елизавета", "Продажи", 450);
        Employee employee4 = new Employee("Екатерина", "Логистика", 850);
        Employee employee5 = new Employee("Клининг", "Клининг", 230);

        List<Employee> listEmployees = List.of(employee1, employee2, employee3, employee4, employee5);

        TestEmployee testEmployee = new TestEmployee();
        System.out.println("----------------");
        testEmployee.filterEmployee(listEmployees, employee -> employee.getDepartment() == "Айти" &&
                employee.getSalary() > 200);
        System.out.println("----------------");
        testEmployee.filterEmployee(listEmployees, employee -> employee.getName().startsWith("Е") &&
                employee.getSalary() != 450);
        System.out.println("----------------");
        testEmployee.filterEmployee(listEmployees, employee -> employee.getName() == employee.getDepartment());
        System.out.println("----------------");

    }

}

class TestEmployee {

    public void printEmployee(Employee employee) {
        System.out.println(employee);
    }

    public void filterEmployee(List<Employee> listEmployees, Predicate<Employee> predicateEmployee) {
        for(Employee employee : listEmployees) {
            if (predicateEmployee.test(employee)) {
                System.out.println(employee);
            }
        }
    }

}

class Employee {

    private String name;
    private String department;
    private int salary;

    public Employee(String name, String department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return name + " - " + department + " - " + salary;
    }

    String getName() {
        return name;
    }

    String getDepartment() {
        return department;
    }

    int getSalary() {
        return salary;
    }

}