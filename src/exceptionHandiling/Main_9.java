package exceptionHandiling;

import java.io.FileNotFoundException;
import java.io.FileReader;

// Checked Exceptions, FileNotFoundException, Using try-catch

public class Main_9 {

    public static void main(String[] args) {

        try {

            FileReader reader = new FileReader("data.txt");

            System.out.println("File Opened Successfully");

        } catch (FileNotFoundException e) {

            System.out.println("File not found");
        }

        System.out.println("program completed");
    }
}
