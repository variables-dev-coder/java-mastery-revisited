package exceptionHandiling;

// Checked Exceptions, IOException

import java.io.*;

public class Main_11 {

    public static void main(String[] args) {

        try {

            FileReader reader = new FileReader("data.txt");

            BufferedReader br = new BufferedReader(reader);

            String line = br.readLine();

            System.out.println(line);

            br.close();

        } catch (IOException e) {

            System.out.println("Error while reading file");

        }
    }
}
