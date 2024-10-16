package com.payroll.manager;

import com.payroll.employee.Employee;
import com.payroll.exception.InvalidEmployeeException;
import com.payroll.exception.DuplicateEmployeeException;
import com.payroll.util.SalarySlipGenerator;

import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class EmployeeManager implements EmployeeOperations {
    private ArrayList<Employee> employeeList;
    private Set<String> deletedIds;
    private static final String EMPLOYEE_FILE_PATH = "employees.txt"; 
    private static final String DELETED_IDS_FILE_PATH = "deleted_ids.txt";

    public EmployeeManager() {
        employeeList = new ArrayList<>();
        deletedIds = new HashSet<>();
        readFromFile(); 
        readDeletedIdsFromFile(); 
    }

    @Override
    public void addEmployee(Employee emp) throws DuplicateEmployeeException, InvalidEmployeeException {
        String id = emp.getId();
        if (isEmployeeExists(id)) {
            throw new DuplicateEmployeeException("Employee with ID " + id + " already exists.");
        }
        if (deletedIds.contains(id)) {
            throw new InvalidEmployeeException("Employee ID " + id + " has been deleted and cannot be reused.");
        }
        employeeList.add(emp);
        writeToFile();
    }

    @Override
    public void viewEmployees() {
        if (employeeList.isEmpty()) {
            System.out.println("No employees to show.");
        } else {
            for (Employee emp : employeeList) {
                System.out.println(emp);
            }
        }
    }

    @Override
    public void updateEmployee(String id, String newName, double newSalary) throws InvalidEmployeeException {
        Employee employee = findEmployeeById(id);
        if (employee == null) {
            throw new InvalidEmployeeException("Employee with ID " + id + " not found.");
        }
        employee.setName(newName);
        employee.setSalary(newSalary);
        writeToFile(); 
    }

    @Override
    public void deleteEmployee(String id) throws InvalidEmployeeException {
        Employee employee = findEmployeeById(id);
        if (employee == null) {
            throw new InvalidEmployeeException("Employee with ID " + id + " not found.");
        }
        employeeList.remove(employee);
        deletedIds.add(id); 
        writeDeletedIdsToFile(); 
        writeToFile(); 
    }

    @Override
    public void generateSalarySlip(String id) throws InvalidEmployeeException {
        Employee employee = findEmployeeById(id);
        if (employee == null) {
            throw new InvalidEmployeeException("Employee with ID " + id + " not found.");
        }
        
        SalarySlipGenerator.generateSalarySlipInThread(employee);
    }

   
    public boolean isEmployeeExists(String id) {
        return findEmployeeById(id) != null;
    }

    
    public boolean isDeletedId(String id) {
        return deletedIds.contains(id);
    }

    private Employee findEmployeeById(String id) {
        for (Employee emp : employeeList) {
            if (emp.getId().equals(id)) {
                return emp;
            }
        }
        return null;
    }

    
    private void writeToFile() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(EMPLOYEE_FILE_PATH))) {
            for (Employee emp : employeeList) {
                writer.write(emp.getId() + "," + emp.getName() + "," + emp.getSalary());
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error writing to employee file: " + e.getMessage());
        }
    }

  
    private void readFromFile() {
        File file = new File(EMPLOYEE_FILE_PATH);
        if (!file.exists()) {
            return; 
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(EMPLOYEE_FILE_PATH))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length == 3) {
                    String id = data[0];
                    String name = data[1];
                    double salary = Double.parseDouble(data[2]);
                    Employee emp = new Employee(id, name, salary);
                    employeeList.add(emp);
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading from employee file: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Invalid salary format in employee file: " + e.getMessage());
        }
    }

    
    private void writeDeletedIdsToFile() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(DELETED_IDS_FILE_PATH))) {
            for (String id : deletedIds) {
                writer.write(id);
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error writing to deleted IDs file: " + e.getMessage());
        }
    }

 
    private void readDeletedIdsFromFile() {
        File file = new File(DELETED_IDS_FILE_PATH);
        if (!file.exists()) {
            return; 
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(DELETED_IDS_FILE_PATH))) {
            String line;
            while ((line = reader.readLine()) != null) {
                deletedIds.add(line.trim());
            }
        } catch (IOException e) {
            System.out.println("Error reading from deleted IDs file: " + e.getMessage());
        }
    }
}
