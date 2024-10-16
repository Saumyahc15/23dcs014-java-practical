package com.payroll.manager;

import com.payroll.employee.Employee;
import com.payroll.exception.DuplicateEmployeeException;
import com.payroll.exception.InvalidEmployeeException;

public interface EmployeeOperations {
    void addEmployee(Employee emp) throws DuplicateEmployeeException, InvalidEmployeeException;
    void viewEmployees();
    void updateEmployee(String id, String newName, double newSalary) throws InvalidEmployeeException;
    void deleteEmployee(String id) throws InvalidEmployeeException;
    void generateSalarySlip(String id) throws InvalidEmployeeException;
}
