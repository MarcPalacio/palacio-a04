package baseline;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class Solution45Test {
    @Test
    void testStringEditing1() throws IOException {
        MyFileReader fr = new MyFileReader();
        String actual = fr.scanInputFile("exercise45_input.txt");
        String expected =
                "One should never use the word \"use\" in writing. Use \"use\" instead.\n" +
                "For example, \"She uses an IDE to write her Java programs\" instead of \"She\n" +
                "uses an IDE to write her Java programs\".";

        assertEquals(expected, actual);
    }

    @Test
    void testStringEditing2() throws IOException {
        MyFileReader fr = new MyFileReader();
        String actual = fr.scanInputFile("exercise45_test.txt");
        String expected =
                "Using use is fancy.\n" +
                "The word used is the past tense form of use.\n" +
                "The word uses is the 3rd person present form of use.\n" +
                "I don't know how to use this word anymore.";

        assertEquals(expected, actual);
    }
}