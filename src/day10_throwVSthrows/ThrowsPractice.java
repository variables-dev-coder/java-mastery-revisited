package day10_throwVSthrows;

// Understand declaring responsibility

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowsPractice {

    static void readFile() throws FileNotFoundException {
        FileReader fr = new FileReader("data.txt");
    }

    public static void main(String[] args) throws FileNotFoundException {
        readFile();
    }
}

//Remove throws → observe compile error
//Handle using try-catch instead