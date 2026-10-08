package Classes_Objects;

class Book {

    // Properties / Data
    String title;
    String author;
    double price;
    boolean available;

    // Method
    void displayDetails() {
        System.out.println("Title     : " + title);
        System.out.println("Author    : " + author);
        System.out.println("Price     : " + price);
        System.out.println("Available : " + available);
    }

    // Method
    void borrowBook() {

        if (available) {
            available = false;
            System.out.println(title + " has been borrowed.");
        } else {
            System.out.println(title + " is already borrowed.");
        }
    }

    // Method
    void returnBook() {

        available = true;
        System.out.println(title + " has been returned.");
    }
}

public class Main5 {

    public static void main(String[] args) {

        // Creating first object
        Book book1 = new Book();

        book1.title = "Java Programming";
        book1.author = "James";
        book1.price = 500;
        book1.available = true;


        // Creating second object
        Book book2 = new Book();

        book2.title = "Spring Boot";
        book2.author = "Robert";
        book2.price = 700;
        book2.available = true;


        // Display book 1
        book1.displayDetails();

        System.out.println();

        // Borrow book 1
        book1.borrowBook();

        System.out.println();

        // Display book 1 again
        book1.displayDetails();

        System.out.println("\n-------------------");

        // Display book 2
        book2.displayDetails();
    }
}
