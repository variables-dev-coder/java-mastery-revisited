package exceptionRevision;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Test4 {

    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("data.txt"))) {
            System.out.println(br.readLine());
        } catch (IOException e) {
            System.out.println("IO error occurred");
        }
    }
}
