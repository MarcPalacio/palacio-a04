/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Marc Palacio
 */

package baseline;
import java.io.*;

/*
 *  This class is responsible for creating the files
 */

public class FileCreator {
    public void getInput(){
        Methods method = new Methods();
        // Asks the user for a site name
        String siteName = method.askQuestion("Site Name: ");
        // Asks the user for an author
        String authorName = method.askQuestion("Author: ");
        // Asks the user if they want a folder for JavaScript (y or n)
        String choiceJavaScript = method.verifyInput("Do you want a folder for Javascript? ");
        // Asks the user if they want a folder for CSS (y or n)
        String choiceCSS = method.verifyInput("Do you want a folder for CSS? ");

        // Create website folder of name
        String pathSite = "data\\website\\" + siteName;
        try {
            createFiles(pathSite, siteName, authorName, choiceJavaScript, choiceCSS);
        } catch(FileNotFoundException e){
            System.out.println("File not found");
        } catch(IOException a){
            System.out.println("An I/O Error occurred");
            a.printStackTrace();
        }
    }

    // This function is seperate for testing
    public void createFiles(String pathSite, String siteName, String authorName,
                            String choiceJS, String choiceCSS) throws IOException {
        // Creates new directory inside website
        File website = new File(pathSite);
        website.mkdirs();
        // Print it out creation was successful
        System.out.println("Created ./website/" + siteName);

        // calls createHTML
        createHTML(pathSite, siteName, authorName);

        // if the user entered y for JavaScript folder
        if(choiceJS.equalsIgnoreCase("y")){
            // Create js folder within website name folder
            String pathSiteJS = pathSite + "\\js";
            File js = new File(pathSiteJS);
            js.mkdirs();
            System.out.println("Created ./website/" + siteName + "/js/");
        }

        // if the user entered y for CSS folder
        if(choiceCSS.equalsIgnoreCase("y")){
            // Create css golder within website name folder
            String pathSiteCSS = pathSite + "\\css";
            File css = new File(pathSiteCSS);
            css.mkdirs();
            System.out.println("Created ./website/" + siteName + "/css/");
        }
    }
    private void createHTML(String pathSite, String siteName, String author) throws IOException {
        // Creates a html file
        String pathSiteHTML = pathSite + "\\index.html";
        File html = new File(pathSiteHTML);
        BufferedWriter bw = new BufferedWriter(new FileWriter(html));
        bw.write("<html>\n\t<title>" + siteName + "</title>\n\t<meta>" + author + "</meta>\n</html>");
        bw.close();
        // Print creation was successful
        System.out.println("Created ./website/" + siteName + "/index.html");
    }
}
