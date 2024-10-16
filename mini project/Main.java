package com.payroll.main;

import com.payroll.employee.Employee;
import com.payroll.manager.EmployeeManager;
import com.payroll.exception.InvalidEmployeeException;
import com.payroll.exception.DuplicateEmployeeException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("1. Add Employee");
            System.out.println("2. View Employees");
            System.out.println("3. Update Employee");
            System.out.println("4. Delete Employee");
            System.out.println("5. Generate Salary Slip");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                  
                    System.out.print("Enter Employee ID: ");
                    String id = scanner.nextLine();

                
                    try {
                        if (manager.isEmployeeExists(id)) {
                            throw new DuplicateEmployeeException("Employee with ID " + id + " already exists.");
                        }
                        if (manager.isDeletedId(id)) {
                            throw new InvalidEmployeeException("Employee ID " + id + " has been deleted and cannot be reused.");
                        }
                    } catch (InvalidEmployeeException | DuplicateEmployeeException e) {
                        System.out.println(e.getMessage());
                        break; // Exit the case if there's an error
                    }

                   
                    System.out.print("Enter Employee Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Employee Salary: ");
                    double salary = scanner.nextDouble();
                    
                    try {
                        Employee emp = new Employee(id, name, salary);
                        manager.addEmployee(emp);
                        System.out.println("Employee added successfully!");
                    } catch (InvalidEmployeeException e) {
                        System.out.println("Invalid employee: " + e.getMessage());
                    } catch (DuplicateEmployeeException e) {
                        System.out.println("Duplicate employee: " + e.getMessage());
                    }
                    break;

                case 2:
                 
                    System.out.println("Employee List:");
                    manager.viewEmployees();
                    break;

                case 3:
                   
                    System.out.print("Enter Employee ID to update: ");
                    String updateId = scanner.nextLine();
                    System.out.print("Enter New Name: ");
                    String newName = scanner.nextLine();
                    System.out.print("Enter New Salary: ");
                    double newSalary = scanner.nextDouble();
                    
                    try {
                        manager.updateEmployee(updateId, newName, newSalary);
                        System.out.println("Employee updated successfully.");
                    } catch (InvalidEmployeeException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                case 4:
                
                    System.out.print("Enter Employee ID to delete: ");
                    String deleteId = scanner.nextLine();
                    
                    try {
                        manager.deleteEmployee(deleteId);
                        System.out.println("Employee deleted successfully.");
                    } catch (InvalidEmployeeException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                case 5:
                  
                    System.out.print("Enter Employee ID to generate salary slip: ");
                    String slipId = scanner.nextLine();
                    
                    try {
                        manager.generateSalarySlip(slipId);
                        System.out.println("Salary slip generated successfully.");
                    } catch (InvalidEmployeeException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                case 6:
                  
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
