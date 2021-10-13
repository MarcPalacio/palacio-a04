/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Marc Palacio
 */

package baseline;

import java.io.*;

public class Solution41 {
    public static void main(String[] args){
        // Creates instance of NameSorter and myFileWriter
        NameSorter sorter = new NameSorter();
        MyFileWriter fw = new MyFileWriter();

        // Creates file object for input
        File inputFile = new File("data/exercise41_input.txt");

        // Calls scanInput from NameSorter
        sorter.createNameList(inputFile);

        // Calls createOutput from NameSorter
        String output = sorter.createOutput();
        //System.out.println(output); Print statement to see what would be written to the file

        // Calls writeToFile from NameSorter
        fw.writeToFile(output);
    }
}
