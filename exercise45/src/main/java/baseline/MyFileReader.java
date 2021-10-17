/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Marc Palacio
 */

package baseline;
import java.io.*;

/*
 *  This class is responsible for reading the file input
 */

public class MyFileReader {
    public String scanInputFile(String fileInputName) throws IOException {
        // Creates a StringBuilder
        StringBuilder output = new StringBuilder();
        // Creates instance of StringEditor
        StringEditor se = new StringEditor();
        // Creates a file reader
        try(BufferedReader br = new BufferedReader(new FileReader("data\\"+fileInputName))){
            String add;
            // while file reader has a next line
            while((add = br.readLine()) != null){
                // Reads line and calls editString in String editor
                String newString = se.editString(add, "utilize", "use");
                // added edited string to StringBuilder
                output.append(newString);
                if(add != null){
                    output.append("\n");
                }
            }
            output.deleteCharAt(output.length()-1);
        } catch(FileNotFoundException e){ // catch FileNotFoundException and IOException
            System.out.println("File not found");
        } catch (IOException a){
            System.out.println("An I/O Error occurred");
            a.printStackTrace();
        }
        // Return output (toString since it is a StringBuilder
        return output.toString();
    }
}
