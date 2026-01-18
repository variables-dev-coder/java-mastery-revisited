package day12_try_with_resources;

class ResourceA implements AutoCloseable {
    public void close() {
        System.out.println("Resource A closed");
    }
}

class ResourceB implements AutoCloseable {
    public void close() {
        System.out.println("Resource B closed");
    }
}

public class MultiResourceDemo {

    public static void main(String[] args) {

        try (
                ResourceA a = new ResourceA();
                ResourceB b = new ResourceB()
        ) {
            System.out.println("Using resources");
        }
    }
}

//Using resources
//Resource B closed
//Resource A closed