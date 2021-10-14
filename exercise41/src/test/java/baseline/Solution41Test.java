/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Marc Palacio
 */

package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution41Test {
    @Test
    void testCreateOutput1(){
        NameSorter sorter = new NameSorter();
        String fileInputName = "exercise41_test1_input.txt";
        sorter.createNameList(fileInputName);

        String actual = sorter.createOutput();
        String expected =
                "Total of 10 names\n" +
                "-----------------\n" +
                "Badguy, Sol\n" +
                "Dickinson, Goldlewis\n" +
                "Kiske, Ky\n" +
                "Low, Axl\n" +
                "Mito, Anji\n" +
                "Rage, Millia\n" +
                "Valentine, Jack-O'\n" +
                "Valentine, Ramlethal\n" +
                "Whitefang, Leo\n" +
                "Zanuff, Chipp";

        assertEquals(expected, actual);
    }

    @Test
    void testCreateOuput2(){
        NameSorter sorter = new NameSorter();
        String fileInputName = "exercise41_test2_input.txt";
        sorter.createNameList(fileInputName);

        String actual = sorter.createOutput();
        String expected =
                "Total of 12 names\n" +
                "-----------------\n" +
                "Donne, Kagero\n" +
                "Eden, Kyoka\n" +
                "Garrison, Gemma\n" +
                "Ichijo, Hanabi\n" +
                "Karman, Nagi\n" +
                "Nazar, Tsugumi\n" +
                "Randall, Kasane\n" +
                "Ritter, Shiden\n" +
                "Spring, Arashi\n" +
                "Spring, Fubuki\n" +
                "Sumeragi, Yuito\n" +
                "Travers, Luka";

        assertEquals(expected, actual);
    }
}