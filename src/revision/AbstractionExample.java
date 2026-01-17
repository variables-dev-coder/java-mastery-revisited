package revision;

interface Database {
    void connect();
}

class MySQLDB implements Database {
    public void connect() {
        System.out.println("Connected to MySQL");
    }
}

class MongoDB implements Database {
    public void connect() {
        System.out.println("Connected to MongoDB");
    }
}

public class AbstractionExample {
    public static void main(String[] args) {
        Database db = new MySQLDB(); // can change to MongoDB
        db.connect();
    }
}

