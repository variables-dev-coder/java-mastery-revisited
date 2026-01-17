package revision;

class Engine2 {
    void start() {
        System.out.println("Engine started");
    }
}

class Car3 {
    private Engine2 engine2 = new Engine2();

    void drive() {
        engine2.start();
        System.out.println("Car driving");
    }
}

public class CompositionExample {
    public static void main(String[] args) {
        Car3 car3 = new Car3();
        car3.drive();
    }
}

