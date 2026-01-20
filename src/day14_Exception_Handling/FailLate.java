package day14_Exception_Handling;

public class FailLate {

    static void createUser(String name) {
        if (name != null) {
            if (!name.isEmpty()) {
                System.out.println("User created");
            }
        }
    }

    public static void main(String[] args) {
        createUser(null);
    }
}

