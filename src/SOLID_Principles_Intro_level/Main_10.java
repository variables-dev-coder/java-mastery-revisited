package SOLID_Principles_Intro_level;

// Interface Segregation Principle (ISP)

// Example 1: Printer Management

interface Printable {
    void print();
}

interface Scannable {
    void scan();
}

interface Faxable {
    void fax();
}

class SimplePrinter implements Printable {

    @Override
    public void print() {
        System.out.println("Printing document");
    }
}

class MultiFunctionPrinter implements Printable, Scannable, Faxable {

    @Override
    public void print() {
        System.out.println("Printing document");
    }

    @Override
    public void scan() {
        System.out.println("Scanning document");
    }

    @Override
    public void fax() {
        System.out.println("Sending fax");
    }
}

public class Main_10 {

    public static void main(String[] args) {

        SimplePrinter simple = new SimplePrinter();
        simple.print();

        MultiFunctionPrinter multi = new MultiFunctionPrinter();

        multi.print();
        multi.scan();
        multi.fax();
    }
}
