 import java.util.Scanner;

class Employee {
     String firstName;
     String lastName;
     double monthlySalary;

    public Employee(String firstName, String lastName, double monthlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        if (monthlySalary > 0) {
            this.monthlySalary = monthlySalary;
        } else {
            this.monthlySalary = 0.0;
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        if (monthlySalary > 0) {
            this.monthlySalary = monthlySalary;
        } else {
            this.monthlySalary = 0.0;
        }
    }

    public double getYearlySalary() {
        return monthlySalary * 12;
    }

    public void giveRaise(double percentage) {
        monthlySalary *= (1 + percentage / 100);
    }
}

public class EmployeeTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first name for employee 1:");
        String firstName1 = scanner.nextLine();
        System.out.println("Enter last name for employee 1:");
        String lastName1 = scanner.nextLine();
        System.out.println("Enter monthly salary for employee 1:");
        double monthlySalary1 = scanner.nextDouble();
        scanner.nextLine(); // Consume newline left-over

        System.out.println("Enter first name for employee 2:");
        String firstName2 = scanner.nextLine();
        System.out.println("Enter last name for employee 2:");
        String lastName2 = scanner.nextLine();
        System.out.println("Enter monthly salary for employee 2:");
        double monthlySalary2 = scanner.nextDouble();
        scanner.nextLine(); // Consume newline left-over

        Employee employee1 = new Employee(firstName1, lastName1, monthlySalary1);
        Employee employee2 = new Employee(firstName2, lastName2, monthlySalary2);

        System.out.println("Employee 1 yearly salary: " + employee1.getYearlySalary());
        System.out.println("Employee 2 yearly salary: " + employee2.getYearlySalary());

        employee1.giveRaise(10);
        employee2.giveRaise(10);

        System.out.println("Employee 1 yearly salary after 10% raise: " + employee1.getYearlySalary());
        System.out.println("Employee 2 yearly salary after 10% raise: " + employee2.getYearlySalary());
    }
}
