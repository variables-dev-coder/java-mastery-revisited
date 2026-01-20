package day14_Exception_Handling;

public class FailFast {

    static void createUser(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("User name is required");
        }
        System.out.println("User created");
    }

    public static void main(String[] args) {
        createUser(null);
    }
}

