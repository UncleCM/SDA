/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adapter;

/**
 *
 * @author boonjv
 */
import java.util.Vector;

/**
 *
 * @author boonjv
 */
public class Database {

    private Vector<Employee> employees; //Stores the employees

    public Database() {
        employees = new Vector<Employee>();
    }

    public void addEmployee(Employee employee) {
        //Code to add employee
        employees.add(employee);
    }

    public void deleteEmployee(long emp_num) {
        //Code to delete employee
        employees.removeIf(emp -> emp.getEmpNum() == emp_num);
    }
    
    public boolean checkEmployee(long emp_num) {
        //Code to check if employee exists
        for (Employee emp : employees) {
            if (emp.getEmpNum() == emp_num) {
                return true;
            }
        }
        return false;
    }
    
    public void printAllEmployees() {
        //Code to print all employees
        System.out.println("Employee Database:");
        for (Employee emp : employees) {
            System.out.println("ID: " + emp.getEmpNum() + ", Name: " + emp.getName() + " " + emp.getSurname() + ", Salary: $" + emp.getSalary());
        }
    }

}
