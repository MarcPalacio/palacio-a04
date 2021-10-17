/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Marc Palacio
 */

package baseline;

/*
 *  This class is responsible for writing to the output file
 */

import java.io.*;

public class MyFileWriter {
    public void writeToFile(String write, String fileOutputName){
        // Creates a file writer
        try(FileWriter fr = new FileWriter("data\\" + fileOutputName)){
            // Takes the input write and writes it to the specified file
            fr.write(write);
            // catch FileNotFoundException and IOException
        } catch(FileNotFoundException e){
            System.out.println("File not found");
        } catch (IOException a){
            System.out.println("An I/O Error occurred");
            a.printStackTrace();
        }
    }
}
