/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adapter;

import java.util.ArrayList;

/**
 *
 * @author boonjv
 */
public class Records {

    private ArrayList<Employee> employees; //Stores the employees

    public Records() {
        employees = new ArrayList<Employee>();
    }

    public void insert(Employee employee) {
        //Code to insert employee
        employees.add(employee);
    }

    public void remove(long emp_num) {
        //Code to remove employee
        employees.removeIf(emp -> emp.getEmpNum() == emp_num);
    }
    
    public void printAllRecords() {
        //Code to print all employee records
        System.out.println("Employee Records:");
        for (Employee emp : employees) {
            System.out.println("ID: " + emp.getEmpNum() + ", Name: " + emp.getName() + " " + emp.getSurname() + ", Salary: $" + emp.getSalary());
        }
    }

    public boolean isEmployee(long emp_num) {
        //Code to find employee
        for (Employee emp : employees) {
            if (emp.getEmpNum() == emp_num) {
                return true;
            }
        }
        return false;
    }
    
}
