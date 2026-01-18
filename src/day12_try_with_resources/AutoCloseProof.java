package day12_try_with_resources;

class MyResource implements AutoCloseable {

    public void use() {
        System.out.println("Using resource");
    }

    @Override
    public void close() {
        System.out.println("Resource closed automatically");
    }
}

public class AutoCloseProof {

    public static void main(String[] args) {
        try (MyResource r = new MyResource()) {
            r.use();
        }
    }
}

//Using resource
//Resource closed automatically