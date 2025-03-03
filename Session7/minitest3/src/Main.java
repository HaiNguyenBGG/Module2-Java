import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new FulltimeEmployee("F001", "John", 20, "038825555", "john@gmail.com", 10000000, 1000000, 500000);
        employees[1] = new PartimeEmployee("P001", "Jane", 28, "099889999", "jane@gmail.com", 24);
        employees[2] = new FulltimeEmployee("F002", "Bob", 30, "038826666", "bob@gmail.com", 5000000, 200000, 500000);
        employees[3] = new PartimeEmployee("P002", "Alice", 25, "086954444", "alice@gmail.com", 12);
        employees[4] = new FulltimeEmployee("F003", "Bob", 30, "033254999", "bob@gmail.com", 3000000, 100000, 1000000);

        System.out.println();
        printListEmployees(employees);
        System.out.println();
        calculateSalary(employees);
        System.out.println();
        calculateAverageSalary(employees);
        System.out.println();
        printListEmployeesLowerSalary(employees);
        System.out.println();
        calculateSalaryPartTimeEmployee(employees);
        System.out.println();
        sortFullTimesEmployees(employees);
    }

    public static void printListEmployees(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public static void calculateSalary(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println(employee.getId() + " : " + employee.getSalary());
        }
    }

    public static int calculateAverageSalary(Employee[] employees) {
        int totalSalary = 0;
        for (Employee employee : employees) {
            totalSalary += employee.getSalary();
        }
        System.out.println("Total average salary: " + totalSalary / employees.length);
        return totalSalary / employees.length;
    }

    public static void printListEmployeesLowerSalary(Employee[] employees) {
        int averageSalary = calculateAverageSalary(employees);
        System.out.println("List of employees with salary lower than average:");
        boolean found = false;
        for (Employee employee : employees) {
            if (employee instanceof FulltimeEmployee && employee.getSalary() < averageSalary) {
                System.out.println(employee);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Not found");
        }
    }

    public static void calculateSalaryPartTimeEmployee(Employee[] employees) {
        int totalSalary = 0;
        int countPartTimeEmployees = 0;
        for (Employee employee : employees) {
            if (employee instanceof PartimeEmployee) {
                totalSalary += employee.getSalary();
                countPartTimeEmployees++;
            }
        }
        if (countPartTimeEmployees > 0) {
            System.out.println("Total PartTime Employee salary : " + totalSalary);
        } else {
            System.out.println("No part-time employees found.");
        }
    }
    public static void sortFullTimesEmployees(Employee[] employees) {
        Employee[] fullTimeEmployees = new Employee[employees.length];
        int index = 0;
        for (Employee employee : employees) {
            if (employee instanceof FulltimeEmployee) {
                fullTimeEmployees[index] = employee;
                index++;
            }
        }
        System.out.println("List of employees sorted by salary:");
        Arrays.sort(fullTimeEmployees, 0, index, (a, b) -> a.getSalary() - b.getSalary());
        for (int i = 0; i < index; i++) {
            System.out.println(fullTimeEmployees[i]);
        }
    }
}

