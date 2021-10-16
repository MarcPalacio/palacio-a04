/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Marc Palacio
 */

package baseline;

/*
 *  This class is responsible for the creation of employees
 */

public class Employee {
    // Attributes of Employee class
    private String lastName;
    private String firstName;
    private int salary;

    // Constructor of class employee
    public Employee(String lastName, String firstName, int salary){
        this.lastName = lastName;
        this.firstName = firstName;
        this.salary = salary;
    }

    @Override
    public String toString(){
        // Returns a string in the format of one line of the table
        return String.format("%-10s%-10s%d", lastName, firstName, salary);
    }
}
