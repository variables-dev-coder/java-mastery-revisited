package Encapsulation;


class Book {

    // 1. Private data members
    private int bookId;
    private String title;
    private String author;
    private boolean available;

    // 2. Constructor
    public Book(int bookId, String title, String author) {
        this.bookId = bookId;
        setTitle(title);
        setAuthor(author);
        this.available = true;
    }

    // 3. Getter for book ID
    public int getBookId() {
        return bookId;
    }

    // 4. Getter and setter for title
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title != null && !title.isBlank()) {
            this.title = title;
        } else {
            System.out.println("Title cannot be empty!");
        }
    }

    // 5. Getter and setter for author
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        if (author != null && !author.isBlank()) {
            this.author = author;
        } else {
            System.out.println("Author cannot be empty!");
        }
    }

    // 6. Getter for availability
    public boolean isAvailable() {
        return available;
    }

    // 7. Borrow book
    public void borrowBook() {
        if (available) {
            available = false;
            System.out.println("Book borrowed successfully.");
        } else {
            System.out.println("Book is already borrowed!");
        }
    }

    // 8. Return book
    public void returnBook() {
        if (!available) {
            available = true;
            System.out.println("Book returned successfully.");
        } else {
            System.out.println("Book is already available!");
        }
    }

    // 9. Display book details
    public void displayDetails() {
        System.out.println("Book ID: " + bookId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println(
                "Available: " + (available ? "Yes" : "No")
        );
    }
}

public class LibraryEncapsulationDemo {

    public static void main(String[] args) {

        // Create a book
        Book book = new Book(
                101,
                "Clean Code",
                "Robert C. Martin"
        );

        System.out.println("=== Initial Book Details ===");
        book.displayDetails();

        // Borrow the book
        System.out.println("\n=== Borrow Book ===");
        book.borrowBook();
        System.out.println(
                "Available: " + book.isAvailable()
        );

        // Try borrowing again
        System.out.println("\n=== Borrow Again ===");
        book.borrowBook();

        // Return the book
        System.out.println("\n=== Return Book ===");
        book.returnBook();
        System.out.println(
                "Available: " + book.isAvailable()
        );

        // Update the title
        System.out.println("\n=== Update Title ===");
        book.setTitle("Effective Java");
        System.out.println(
                "Updated Title: " + book.getTitle()
        );

        // Final details
        System.out.println("\n=== Final Details ===");
        book.displayDetails();
    }
}

