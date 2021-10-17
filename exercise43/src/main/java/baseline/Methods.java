/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Marc Palacio
 */

package baseline;
import java.util.*;

/*
 *  This class is responsible for handling basic methods that will be used
 */

public class Methods {
    private static Scanner in = new Scanner(System.in);
    public String askQuestion(String question){
        // Asks the user a question
        System.out.print(question);
        // Returns the user input
        return in.nextLine();
    }

    public String verifyInput(String question){
        // Different from askQuestion as it will specifically look for either yes or no (y or n)
        String output = "";
        boolean invalidInput;
        // do while invalid input is true
        do{
            // invalidInput is set to false
            invalidInput = false;
            // Try
            try{
                // while user input is not y or n
                do{
                    // Ask the user the question
                    System.out.print(question);
                    // Scans for input
                    output = in.nextLine();
                    // checks if it is equal to y or n (or Y or N since it will ignore case)
                    if(!(output.equalsIgnoreCase("y") || output.equalsIgnoreCase("n"))){
                        System.out.println("Please enter a valid input.");
                    }
                }while(!(output.equalsIgnoreCase("y") || output.equalsIgnoreCase("n")));
            } catch(InputMismatchException e){ // catch an InputMisMatchException
                // Print out an error
                System.out.println("Please enter a valid input.");
                // set invalidInput to true
                invalidInput = true;
            }
        }while(invalidInput);

        // Return output
        return output;
    }
}
