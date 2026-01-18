package day12_try_with_resources;

public class JdbcStyleTWR {

    public static void main(String[] args) {

        try (
                FakeConnection con = new FakeConnection();
                FakeStatement st = new FakeStatement();
                FakeResultSet rs = new FakeResultSet()
        ) {
            System.out.println("Query executed");
        }
    }
}

// Mock JDBC resources
class FakeConnection implements AutoCloseable {
    public void close() {
        System.out.println("Connection closed");
    }
}

class FakeStatement implements AutoCloseable {
    public void close() {
        System.out.println("Statement closed");
    }
}

class FakeResultSet implements AutoCloseable {
    public void close() {
        System.out.println("ResultSet closed");
    }
}

//Query executed
//ResultSet closed
//Statement closed
//Connection closed