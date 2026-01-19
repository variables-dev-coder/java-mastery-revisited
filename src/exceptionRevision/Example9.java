package exceptionRevision;

import java.io.*;

public class Example9 {
    public static void main(String[] args) {
        try (FileReader fr = new FileReader("test.txt")) {
            System.out.println("File opened");
        } catch (IOException e) {
            System.out.println("Error handling file");
        }
    }
}

