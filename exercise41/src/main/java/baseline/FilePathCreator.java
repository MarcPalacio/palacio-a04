/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Marc Palacio
 */

package baseline;

import java.io.*;
import java.nio.file.*;

/*
 *  This class is responsible for creating the path variable for MyFileReader and MyFileWriter
 */

public class FilePathCreator {
    public File createFilePath(String fileName){
        // Creates a path to directory
        // currentPath gets the path to the current user directory
        Path currentPath = Paths.get(System.getProperty("user.dir"));

        // filePath adds the data directory plus the file name to create the Path to fileName
        Path filePath = Paths.get(currentPath.toString(), "data", fileName);

        // Creates and return an output file based on the filePath
        File output =  new File(filePath.toString());

        // Returns the file (which is pointing at the path)
        return output;
    }
}
