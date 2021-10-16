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
        // Creates a path to the directory
        Path currentPath = Paths.get(System.getProperty("user.dir"));
        Path filePath = Paths.get(currentPath.toString(), "data", fileName);
        File output = new File(filePath.toString());

        // Returns the file using that path + fileName
        return output;
    }
}
