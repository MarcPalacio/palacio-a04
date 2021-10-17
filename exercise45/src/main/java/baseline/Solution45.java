/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Marc Palacio
 */

package baseline;

import java.io.*;
import java.util.*;

public class Solution45 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args){
        // Creates an instance of MyFileReader and MyFileWriter
        MyFileReader fr = new MyFileReader();
        MyFileWriter fw = new MyFileWriter();
        // Calls scanInputFile in MyFileReader
        String write = "";
        try {
            write = fr.scanInputFile("exercise45_input.txt");
        } catch(FileNotFoundException e){ // catch FileNotFoundException and IOException
            System.out.println("File not found");
        } catch (IOException a){
            System.out.println("An I/O Error occurred");
            a.printStackTrace();
        }
        // Prompts the user for the name of the output file
        System.out.print("Enter the name of the output file: ");
        String outputFileName = input.nextLine();
        // Writes to the output file with user specified name
        fw.writeToFile(write, outputFileName);
    }
}
