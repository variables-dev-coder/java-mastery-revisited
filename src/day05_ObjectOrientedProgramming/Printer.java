package day05_ObjectOrientedProgramming;

interface Printer {
    void print();
}

interface Scanner {
    void scan();
}

class SimplePrinter implements Printer {
    public void print() {
        System.out.println("Printing");
    }
}

class MultiFunctionPrinter implements Printer, Scanner {
    public void print() {
        System.out.println("Printing");
    }

    public void scan() {
        System.out.println("Scanning");
    }

    public static void main(String[] args) {
        Printer p = new SimplePrinter();
        p.print();
    }
}

// Printing