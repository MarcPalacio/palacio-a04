/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Marc Palacio
 */

package baseline;

/*
 *  This class is responsible for the creation of employees
 */

import java.util.*;

public class Employee {
    // Attributes of Employee class
    private String lastName;
    private String firstName;
    private int salary;

    // Constructor of class employee
    public Employee(){

    }

    public Employee(String lastName, String firstName, int salary){
        this.lastName = lastName;
        this.firstName = firstName;
        this.salary = salary;
    }

    public String createTable(List<Employee> employeeList){
        // Create a StringBuilder table to store output
        StringBuilder output = new StringBuilder();
        // Add the header to the StringBuilder table
        output.append("Last      First     Salary\n");
        output.append("--------------------------\n");
        // for the size of the arraylist of employees
        for(int i = 0; i < employeeList.size(); i++){
            // Call the toString method inside the employee class
            output.append(employeeList.get(i).toString());
            if(i < employeeList.size()-1){
                output.append("\n");
            }
        }

        // Return output
        return output.toString();
    }

    @Override
    public String toString(){
        // Returns a string in the format of one line of the table
        return String.format("%-10s%-10s%d", lastName, firstName, salary);
    }
}
