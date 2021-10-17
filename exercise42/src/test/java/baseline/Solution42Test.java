package baseline;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class Solution42Test {
    @Test
    void testSolution42(){
        MyFileReader reader = new MyFileReader();
        Employee printer = new Employee();
        List<Employee> listEmployees = new ArrayList<>();

        String inputFile = "exercise42_input.txt";

        try {
            listEmployees = reader.scanInputFile(inputFile);
        } catch(FileNotFoundException e){
            System.out.println("File not found");
        } catch(IOException a){
            System.out.println("An I/O Error occurred");
            a.printStackTrace();
        }

        String actual = printer.createTable(listEmployees);
        String expected =
                "Last      First     Salary\n" +
                "--------------------------\n" +
                "Ling      Mai       55900\n" +
                "Johnson   Jim       56500\n" +
                "Jones     Aaron     46000\n" +
                "Jones     Chris     34500\n" +
                "Swift     Geoffrey  14200\n" +
                "Xiong     Fong      65000\n" +
                "Zarnecki  Sabrina   51500";

        assertEquals(expected, actual);
    }
}