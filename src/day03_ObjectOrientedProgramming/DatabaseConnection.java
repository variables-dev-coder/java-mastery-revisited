package day03_ObjectOrientedProgramming;

public class DatabaseConnection {

    private static DatabaseConnection instance;

    private DatabaseConnection() {
        System.out.println("Connection created");
    }

    public static DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }

    public static void main(String[] args) {
        DatabaseConnection c1 = getInstance();
        DatabaseConnection c2 = getInstance();
        System.out.println(c1 == c2); // true
    }
}

//Connection created
//true