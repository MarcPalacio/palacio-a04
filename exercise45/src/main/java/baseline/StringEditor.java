/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Marc Palacio
 */

package baseline;

/*
 *  This class is responsible for editing the file input
 */

public class StringEditor {
    public String editString(String input, String oldWord, String newWord){
        // This function will take in an input and a word
        // Then replace that word accordingly
        return input.replace(oldWord, newWord);
    }
}
