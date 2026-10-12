package constructor;


class Book {

    int bookId;
    String title;
    String author;
    double price;
    boolean isAvailable;

    // 1. No-argument constructor
    Book() {
        this(0, "Unknown", "Unknown", 0.0, true);
        System.out.println("Default book created");
    }

    // 2. Parameterized constructor
    Book(int bookId, String title, String author,
         double price, boolean isAvailable) {

        this.bookId = bookId;
        this.title = title;
        this.author = author;

        if (price < 0) {
            throw new IllegalArgumentException(
                    "Price cannot be negative"
            );
        }

        this.price = price;
        this.isAvailable = isAvailable;
    }

    // 3. Constructor overloading
    Book(int bookId, String title, String author) {
        this(bookId, title, author, 500.0, true);
    }

    // 4. Copy constructor
    Book(Book other) {
        this(other.bookId, other.title, other.author,
                other.price, other.isAvailable);
    }

    // Borrow book
    void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println(title + " borrowed successfully");
        } else {
            System.out.println(title + " is not available");
        }
    }

    // Return book
    void returnBook() {
        if (!isAvailable) {
            isAvailable = true;
            System.out.println(title + " returned successfully");
        } else {
            System.out.println(title + " was not borrowed");
        }
    }

    // Display book details
    void display() {
        System.out.println("Book ID: " + bookId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: Rs. " + price);
        System.out.println("Available: " + isAvailable);
        System.out.println("--------------------------");
    }
}

public class LibraryConstructorDemo {

    public static void main(String[] args) {

        // No-argument constructor
        Book b1 = new Book();
        b1.display();

        // Parameterized constructor
        Book b2 = new Book(
                101, "Effective Java", "Joshua Bloch",
                800.0, true
        );

        b2.display();

        // Overloaded constructor
        Book b3 = new Book(
                102, "Clean Code", "Robert C. Martin"
        );

        b3.display();

        // Borrow and return a book
        b2.borrowBook();
        b2.borrowBook();
        b2.returnBook();

        b2.display();

        // Copy constructor
        Book b4 = new Book(b2);
        b4.display();
    }
}

