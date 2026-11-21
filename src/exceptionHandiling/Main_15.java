package exceptionHandiling;

// throws

import java.io.IOException;

public class Main_15 {

    static void readFile() throws IOException {

        throw new IOException("File reading failed");
    }

    public static void main(String[] args) {

        try {

            readFile();

        } catch (IOException e) {

            System.out.println(e.getMessage());

        }
    }
}
