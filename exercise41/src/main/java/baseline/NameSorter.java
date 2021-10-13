/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Marc Palacio
 */

package baseline;

import java.io.*;
import java.util.*;

/*
 *  This class is responsible for just creating and sorting the file input
 */

public class NameSorter {
    // Attributes of class NameSorter
    private List<String> listNames = new ArrayList<>();

    // Instance of MyFileReader to have access to scanInputFile in MyFileReader
    MyFileReader fr = new MyFileReader();

    public void createNameList(File input){
        // Creates the list of names then sorts it
        try {
            this.listNames = fr.scanInputFile(input);
        } catch (IOException e) {
            System.out.println("An I/O Error occurred");
            e.printStackTrace();
        }
        Collections.sort(listNames);
    }

    public String createOutput(){
        // Creates StringBuilder output
        StringBuilder output = new StringBuilder("");

        // Adds header of list output to output
        output.append("Total of " + listNames.size() + " names\n");
        output.append("-----------------\n");

        // for length of listNames
        for(int i = 0; i < listNames.size(); i++){
            //  add string to output
            output.append(listNames.get(i));
            output.append("\n");
        }

        // Returns string
        return output.toString();
    }
}
