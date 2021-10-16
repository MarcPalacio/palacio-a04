/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Marc Palacio
 */

package baseline;

import java.io.*;
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
        try(BufferedReader br = new BufferedReader(new FileReader(fPC.createFilePath(fileInputName)))){
            String input;
            // while file reader has a nextLine
            // scans the string
            while((input = br.readLine()) != null){
                // stores employee from splitInput in list of employees
                listEmployees.add(splitInput(input));
            }
        } catch(FileNotFoundException e){
            System.out.println("File not found");
        } catch(IOException a){
            System.out.println("An I/O Error occurred");
            a.printStackTrace();
        }

        // returns list of employees
        return listEmployees;
    }

    private Employee splitInput(String input){
        // Takes in the string and splits it
        // Separates using the .split and stores it into an array
        String[] empInfo = input.split(",");

        // Creates an object of employee to store value (make sure to parse salary to int)
        // Salary is going to be an int in this case since you don't really give salary
        // with decimals (example: Salary of $63k a year ($63000 a year))
        Employee newEmployee = new Employee(empInfo[0], empInfo[1], Integer.parseInt(empInfo[2]));

        // Returns employee
        return newEmployee;
    }
}
