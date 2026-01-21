package exceptionRevision;

import java.io.*;

public class TryWithResourcesDemo {
    public static void main(String[] args) {
        try (BufferedReader br =
                     new BufferedReader(new FileReader("data.txt"))) {
            System.out.println(br.readLine());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

