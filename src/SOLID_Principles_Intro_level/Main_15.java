package SOLID_Principles_Intro_level;

// Dependency Inversion Principle (DIP)

// Example 2: Database Management

interface Database {
    void save(String data);
}

class MySQLDatabase implements Database {

    @Override
    public void save(String data) {
        System.out.println("Saving to MySQL: " + data);
    }
}

class OracleDatabase implements Database {

    @Override
    public void save(String data) {
        System.out.println("Saving to Oracle: " + data);
    }
}

class MongoDatabase implements Database {

    @Override
    public void save(String data) {
        System.out.println("Saving to MongoDB: " + data);
    }
}

class UserService {

    private final Database database;

    public UserService(Database database) {
        this.database = database;
    }

    public void registerUser(String name) {
        database.save(name);
    }
}

public class Main_15 {

    public static void main(String[] args) {

        UserService mysqlService =
                new UserService(new MySQLDatabase());

        UserService oracleService =
                new UserService(new OracleDatabase());

        UserService mongoService =
                new UserService(new MongoDatabase());

        mysqlService.registerUser("Munna");
        oracleService.registerUser("Rahul");
        mongoService.registerUser("Amit");
    }
}
