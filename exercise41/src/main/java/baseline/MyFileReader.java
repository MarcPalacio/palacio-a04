/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Marc Palacio
 */

package baseline;

import java.io.*;
import java.util.*;

/*
 *  This class is responsible for scanning in the file
 */

public class MyFileReader {
    private List<String> listNames = new ArrayList<>();

    public List<String> scanInputFile(File inputFileName) throws IOException{
        try (BufferedReader br = new BufferedReader(new FileReader(inputFileName))){
            // Creates file reader
            String add;
            // while file reader has nextLine
            while ((add = br.readLine()) != null) {
                // Uses reader to read line and add to list
                listNames.add(add);
            }
        } catch(FileNotFoundException e){
            System.out.println("File not found");
        } catch (IOException a){
            System.out.println("An I/O Error occurred");
            a.printStackTrace();
        }
        return listNames;
    }
}
