package day12_try_with_resources;

class ResourceWithException implements AutoCloseable {

    @Override
    public void close() {
        System.out.println("Resource closed");
    }
}

public class TWRWithException {

    public static void main(String[] args) {

        try (ResourceWithException r = new ResourceWithException()) {
            System.out.println("Inside try");
            int a = 10 / 0; // exception
        } catch (Exception e) {
            System.out.println("Exception handled");
        }
    }
}

//Inside try
//Resource closed
//Exception handled