/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Marc Palacio
 */

package baseline;

import java.io.*;
import java.util.*;

public class Solution42 {
    public static void main(String[] args){
        // Creates instance of MyFileReader and Employee class
        MyFileReader reader = new MyFileReader();
        Employee printer = new Employee();
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

        System.out.println(printer.createTable(employeeList));


    }
}
