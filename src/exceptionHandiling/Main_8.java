package exceptionHandiling;

import java.io.FileReader;

// Checked Exceptions, FileNotFoundException

public class Main_8 {

    public static void main(String[] args) {

       // FileReader reader = new FileReader("data.txt");

        System.out.println("File opened");
    }
}

// This code produces a compilation error.
// Why?
// Because FileReader can throw FileNotFoundException, which is a checked exception.