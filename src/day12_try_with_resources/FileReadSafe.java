package day12_try_with_resources;

import java.io.*;

public class FileReadSafe {

    public static void main(String[] args) {
        try (BufferedReader br =
                     new BufferedReader(new FileReader("data.txt"))) {

            System.out.println(br.readLine());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

