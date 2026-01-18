package day12_try_with_resources;

import java.io.*;

public class MultiResource {

    public static void main(String[] args) {
        try (
                FileReader fr = new FileReader("data.txt");
                BufferedReader br = new BufferedReader(fr)
        ) {
            System.out.println(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

