package exceptionHandiling;

import java.io.FileReader;
import java.io.FileNotFoundException;

public class Main_10 {

    public static void main(String[] args) throws FileNotFoundException {

        FileReader reader = new FileReader("data.txt");

        System.out.println("File opened successfully");
    }
}

// throws does not handle the exception. It only declares that the exception may be thrown.