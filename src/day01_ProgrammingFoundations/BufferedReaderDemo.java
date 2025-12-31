package day01_ProgrammingFoundations;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class BufferedReaderDemo {
    public static void main(String[] args)throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter number: ");
        int num = Integer.parseInt(br.readLine());

        System.out.println("You entered: " + num);
    }
}

// Faster than Scanner

// Scanner: Easy, slower
// BufferedReader: Fast, manual parsing

// Scanner is convenient, BufferedReader is efficient.