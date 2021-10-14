/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Marc Palacio
 */

package baseline;

import java.io.*;


/*
 *  This class is responsible for writing to a file
 */

public class MyFileWriter {
    FilePathCreator fPC = new FilePathCreator();

    public void writeToFile(String write, String fileOutputName){
        // Creates file writer
        try(FileWriter fr = new FileWriter(fPC.createFilePath(fileOutputName))){
            // Writes string from createOutput to file
            fr.write(write);
        } catch(FileNotFoundException e){
            System.out.println("File not found");
        } catch (IOException a){
            System.out.println("An I/O Error occurred");
            a.printStackTrace();
        }
    }
}
