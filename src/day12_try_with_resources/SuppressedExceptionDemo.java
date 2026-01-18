package day12_try_with_resources;

class BadResource implements AutoCloseable {

    @Override
    public void close() {
        throw new RuntimeException("Close failed");
    }
}

public class SuppressedExceptionDemo {

    public static void main(String[] args) {
        try (BadResource r = new BadResource()) {
            throw new RuntimeException("Main failure");
        } catch (Exception e) {
            System.out.println("Main Exception: " + e.getMessage());

            for (Throwable t : e.getSuppressed()) {
                System.out.println("Suppressed: " + t.getMessage());
            }
        }
    }
}

//Main Exception: Main failure
//Suppressed: Close failed
