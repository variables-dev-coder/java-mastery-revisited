package exceptionRevision;

class BadResource implements AutoCloseable {
    public void close() {
        throw new RuntimeException("Close failed");
    }
}

public class SuppressedDemo {
    public static void main(String[] args) {
        try (BadResource r = new BadResource()) {
            throw new RuntimeException("Main error");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            for (Throwable t : e.getSuppressed()) {
                System.out.println("Suppressed: " + t.getMessage());
            }
        }
    }
}

