/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Marc Palacio
 */

package baseline;

public class Solution41 {
    public static void main(String[] args){
        // Creates instance of NameSorter and myFileWriter
        NameSorter sorter = new NameSorter();
        MyFileWriter fw = new MyFileWriter();

        // Gets the name of the file input
        // In this case it can be hard coded, but this can be changed
        // to take in a user input if the user wanted to specify a certain
        // input.txt or output.txt (When trying to write to a file that
        // doesn't exist, a file will be created)
        String fileInputName = "exercise41_input.txt";

        // Calls scanInput from NameSorter
        sorter.createNameList(fileInputName);

        // Calls createOutput from NameSorter
        String output = sorter.createOutput();
        //System.out.println(output); Print statement to see what would be written to the file

        // This follows the same case as fileInputName
        String fileOutputName = "exercise41_output.txt";
        // Calls writeToFile from NameSorter
        fw.writeToFile(output, fileOutputName);
    }
}
