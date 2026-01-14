package day09_Multiple_catch_Multi_catch;

import java.io.IOException;

public class MixedMultiCatch {
    public static void main(String[] args) {
        try {
            throw new IOException();
        }
        catch (IOException | NullPointerException e) {
            System.out.println("Handled mixed exceptions");
        }
    }
}

// Allowed only if handling is same.
