package day12_try_with_resources;

import java.io.*;

public class FileReadOld {

    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader("data.txt");
        BufferedReader br = new BufferedReader(fr);

        System.out.println(br.readLine());

        // forgot to close
    }
}

