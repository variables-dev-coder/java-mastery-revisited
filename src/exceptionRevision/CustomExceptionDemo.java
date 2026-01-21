package exceptionRevision;

class InvalidUserException extends RuntimeException {
    public InvalidUserException(String msg) {
        super(msg);
    }
}

public class CustomExceptionDemo {
    static void findUser(String id) {
        if (id == null || id.isEmpty()) {
            throw new InvalidUserException("User ID invalid");
        }
    }
    public static void main(String[] args) {
        findUser("");
    }
}

