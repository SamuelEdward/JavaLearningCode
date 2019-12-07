/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author Samuel Edward
 */
public class Employee {
    
    private String firstName;
    private String lastName;
    private double salary;
    
    public Employee (String firstName, String lastName, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
    public String getfirstName() {
        return firstName;
    }
    
    public String getlastName() {
        return lastName;
    }
    
    public double getsalary() {
        return salary;
    }
    
    public void setFirstName(String firstName) {
    this.firstName=firstName;
    }
    
    public void setLastName(String lastName) {
    this.lastName=lastName;
    }
    
    public void setSalary(double salary) {
    this.salary=salary;
    }
    
    
    
    
    
}
