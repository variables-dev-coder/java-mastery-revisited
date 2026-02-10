package exceptionRevision;

import java.io.FileReader;
import java.io.IOException;

public class Example15 {

    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("file.txt");
        } catch (IOException e) {
            System.out.println("File not found or IO error");
        }
    }
}
