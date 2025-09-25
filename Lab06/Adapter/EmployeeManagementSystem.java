/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adapter;

/**
 * Main application demonstrating the Adapter Pattern
 * Shows how ABC Paints and WonderCoat can merge their employee systems
 * without changing existing code
 * 
 * @author boonjv
 */
public class EmployeeManagementSystem {
    
    public static void main(String[] args) {
        System.out.println("=== Employee Management System - Company Merger Demo ===\n");
        
        // Create some sample employees
        Employee emp1 = new Employee("John", "Smith", 1001, 75000.0);
        Employee emp2 = new Employee("Jane", "Doe", 1002, 82000.0);
        Employee emp3 = new Employee("Bob", "Johnson", 1003, 68000.0);
        Employee emp4 = new Employee("Alice", "Williams", 1004, 95000.0);
        
        System.out.println("--- ABC Paints Database System ---");
        // ABC Paints uses Database class
        Database abcDatabase = new Database();
        
        // Add employees to ABC Paints database
        abcDatabase.addEmployee(emp1);
        abcDatabase.addEmployee(emp2);
        
        System.out.println("ABC Paints employees:");
        abcDatabase.printAllEmployees();
        
        // Check if employee exists
        System.out.println("Employee 1001 exists: " + abcDatabase.checkEmployee(1001));
        System.out.println("Employee 9999 exists: " + abcDatabase.checkEmployee(9999));
        
        System.out.println("\n--- WonderCoat Records System ---");
        // WonderCoat uses Records class
        Records wonderCoatRecords = new Records();
        
        // Add employees to WonderCoat records
        wonderCoatRecords.insert(emp3);
        wonderCoatRecords.insert(emp4);
        
        System.out.println("WonderCoat employees:");
        wonderCoatRecords.printAllRecords();
        
        // Check if employee exists
        System.out.println("Employee 1003 exists: " + wonderCoatRecords.isEmployee(1003));
        System.out.println("Employee 9999 exists: " + wonderCoatRecords.isEmployee(9999));
        
        System.out.println("\n--- Using Adapter Pattern for Integration ---");
        // Use adapter to make Records work like Database
        DatabaseAdapter adapter = new DatabaseAdapter(wonderCoatRecords);
        
        // Now we can use WonderCoat's Records system with Database interface
        System.out.println("Using adapter to access WonderCoat data with Database interface:");
        adapter.printAllEmployees();
        
        // Add new employee through adapter
        Employee newEmp = new Employee("Charlie", "Brown", 1005, 71000.0);
        adapter.addEmployee(newEmp);
        
        System.out.println("\nAfter adding employee through adapter:");
        adapter.printAllEmployees();
        
        // Check employee through adapter
        System.out.println("Employee 1005 exists (via adapter): " + adapter.checkEmployee(1005));
        
        // Delete employee through adapter
        adapter.deleteEmployee(1003);
        System.out.println("\nAfter deleting employee 1003 through adapter:");
        adapter.printAllEmployees();
        
        System.out.println("\n=== Integration Complete ===");
        System.out.println("The Adapter Pattern allows ABC Paints and WonderCoat");
        System.out.println("to work together without changing their existing code!");
    }
}
