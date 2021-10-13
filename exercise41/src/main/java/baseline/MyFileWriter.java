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
    public void writeToFile(String write){
        // Creates an output file
        File output =  new File("data/exercise41_output.txt");
        // Creates file writer
        try(FileWriter fr = new FileWriter(output)){
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
