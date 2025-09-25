/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adapter;

/**
 * Adapter class that allows Records (WonderCoat) to work with Database (ABC Paints) interface
 * This implements the Adapter Pattern to integrate two incompatible systems
 * 
 * @author boonjv
 */
public class DatabaseAdapter {
    
    private Records records; // The adaptee - WonderCoat's Records system
    
    /**
     * Constructor that takes a Records object to adapt
     * @param records The Records object from WonderCoat system
     */
    public DatabaseAdapter(Records records) {
        this.records = records;
    }
    
    /**
     * Adapts Database's addEmployee method to Records' insert method
     * @param employee The employee to add
     */
    public void addEmployee(Employee employee) {
        records.insert(employee);
    }
    
    /**
     * Adapts Database's deleteEmployee method to Records' remove method
     * @param emp_num The employee number to delete
     */
    public void deleteEmployee(long emp_num) {
        records.remove(emp_num);
    }
    
    /**
     * Adapts Database's checkEmployee method to Records' isEmployee method
     * @param emp_num The employee number to check
     * @return true if employee exists, false otherwise
     */
    public boolean checkEmployee(long emp_num) {
        return records.isEmployee(emp_num);
    }
    
    /**
     * Adapts Database's printAllEmployees method to Records' printAllRecords method
     */
    public void printAllEmployees() {
        records.printAllRecords();
    }
}
