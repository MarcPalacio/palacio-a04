/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Marc Palacio
 */

package baseline;

import java.io.*;
import java.nio.file.*;
import java.util.*;

/*
 *  This class is responsible for reading in the input and creating the list of employees
 */

public class MyFileReader {
    // Attributes of MyFileReader class
    private List<Employee> listEmployees = new ArrayList<>();
    private FilePathCreator fPC = new FilePathCreator();

    public List<Employee> scanInputFile(String fileInputName) throws IOException{
        // Create a reader
        // while file reader has a nextLine
        // scans the string
        // stores employee from splitInput in list of employees
        // returns list of employees
        return null;
    }

    private Employee splitInput(String input){
        // Takes in the string and splits it
        // Separates using the .split and stores it into an array
        // Creates an object of employee to store value (make sure to parse salary to int)
        // Salary is going to be an int in this case since you don't really give salary
        // with decimals (example: Salary of $63k a year ($63000 a year))
        // Returns employee
        return null;
    }
}
