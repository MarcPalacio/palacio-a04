package baseline;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class Solution43Test {
    @Test
    void testCreationSiteNameDirectory() throws IOException {
        FileCreator fc = new FileCreator();

        String siteName = "testcase";
        String author = "Marc Palacio";
        String choiceJS = "y";
        String choiceCSS = "y";
        String pathSiteWebsite = "data\\website\\" + siteName;

        fc.createFiles(pathSiteWebsite, siteName, author, choiceJS, choiceCSS);
        File file = new File(pathSiteWebsite);
        boolean doesExist = false;
        if(file.exists()){
            doesExist = true;
        }

        assertTrue(doesExist);
    }

    @Test
    void testCreationHTML() throws IOException {
        FileCreator fc = new FileCreator();

        String siteName = "testcase";
        String author = "Marc Palacio";
        String choiceJS = "y";
        String choiceCSS = "y";
        String pathSiteWebsite = "data\\website\\" + siteName;
        String pathSiteHTML = pathSiteWebsite + "\\index.html";

        fc.createFiles(pathSiteWebsite, siteName, author, choiceJS, choiceCSS);
        File file = new File(pathSiteHTML);
        boolean doesExist = false;
        if(file.exists()){
            doesExist = true;
        }

        assertTrue(doesExist);

    }

    @Test
    void testCreationJSDirectory() throws IOException {
        FileCreator fc = new FileCreator();

        String siteName = "testcase";
        String author = "Marc Palacio";
        String choiceJS = "y";
        String choiceCSS = "y";
        String pathSiteWebsite = "data\\website\\" + siteName;
        String pathSiteJS = pathSiteWebsite + "\\js";

        fc.createFiles(pathSiteWebsite, siteName, author, choiceJS, choiceCSS);
        File file = new File(pathSiteJS);
        boolean doesExist = false;
        if(file.exists()){
            doesExist = true;
        }

        assertTrue(doesExist);
    }

    @Test
    void testCreationCSSDirectory() throws IOException {
        FileCreator fc = new FileCreator();

        String siteName = "testcase";
        String author = "Marc Palacio";
        String choiceJS = "y";
        String choiceCSS = "y";
        String pathSiteWebsite = "data\\website\\" + siteName;
        String pathSiteCSS = pathSiteWebsite + "\\css";

        fc.createFiles(pathSiteWebsite, siteName, author, choiceJS, choiceCSS);
        File file = new File(pathSiteCSS);
        boolean doesExist = false;
        if(file.exists()){
            doesExist = true;
        }

        assertTrue(doesExist);
    }
}