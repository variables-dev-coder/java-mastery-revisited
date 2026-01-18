package day12_try_with_resources;

import java.io.*;

public class Java9TWR {

    public static void main(String[] args) throws Exception {

        BufferedReader br =
                new BufferedReader(new FileReader("data.txt"));

        try (br) {
            System.out.println(br.readLine());
        }
    }
}

