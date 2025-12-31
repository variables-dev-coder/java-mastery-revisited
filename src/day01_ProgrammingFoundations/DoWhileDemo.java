package day01_ProgrammingFoundations;

public class DoWhileDemo {
    public static void main(String[] args) {
        int i = 5;

        do {
            System.out.println("Executed once");
            i++;
        } while (i < 5);
    }
}

// Runs at least once (favorite interview question)