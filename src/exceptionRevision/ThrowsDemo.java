package exceptionRevision;

import java.io.FileReader;
import java.io.FileNotFoundException;

public class ThrowsDemo {
    static void readFile() throws FileNotFoundException {
        new FileReader("data.txt");
    }
    public static void main(String[] args) throws FileNotFoundException {
        readFile();
    }
}

