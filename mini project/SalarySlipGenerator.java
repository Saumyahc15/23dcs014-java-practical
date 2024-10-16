package com.payroll.util;

import com.payroll.employee.Employee;

public class SalarySlipGenerator implements Runnable {
    private Employee employee;

    public SalarySlipGenerator(Employee employee) {
        this.employee = employee;
    }

    @Override
    public void run() {
        String slip = "----------- Salary Slip -----------\n" +
                      "Employee ID: " + employee.getId() + "\n" +
                      "Name: " + employee.getName() + "\n" +
                      "Salary: " + employee.getSalary() + "\n" +
                      "-----------------------------------";
        try {
           
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Salary slip generation interrupted for Employee ID: " + employee.getId());
            return;
        }
        System.out.println(slip);
    }

    
    public static void generateSalarySlipInThread(Employee employee) {
        SalarySlipGenerator generator = new SalarySlipGenerator(employee);
        Thread thread = new Thread(generator);
        thread.start();
    }
}
