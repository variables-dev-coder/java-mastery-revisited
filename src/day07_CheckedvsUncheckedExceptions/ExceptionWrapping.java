package day07_CheckedvsUncheckedExceptions;

/*
Converting Checked → Unchecked (Exception Wrapping)
Concept
Hide low-level failures and keep APIs clean.

 */

import java.io.FileReader;
import java.io.FileNotFoundException;

public class ExceptionWrapping {

    public static void readFile() {
        try {
            FileReader reader = new FileReader("data.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException("Unable to read file", e);
        }
    }
}

// Explanation

//Checked exception caught

//Wrapped inside unchecked exception

//Original cause preserved

//Interview Line
//Exception wrapping preserves root cause while hiding implementation details.