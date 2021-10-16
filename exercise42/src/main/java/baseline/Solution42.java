/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Marc Palacio
 */

package baseline;

import java.io.*;
import java.util.*;

public class Solution42 {
    public static void main(String[] args){
        // Creates instance of MyFileReader
        MyFileReader reader = new MyFileReader();
        List<Employee> employeeList = new ArrayList<>();
        // Stores name of input file
        String fileInputName = "exercise42_input.txt";
        // Creates an arraylist of employees with scanInputFile in MyFileReader
        try {
            employeeList = reader.scanInputFile(fileInputName);
        } catch(FileNotFoundException e){
            System.out.println("File not found");
        } catch(IOException a){
            System.out.println("An I/O Error occurred");
            a.printStackTrace();
        }

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

        // Print out the output
        System.out.println(output);
    }
}
