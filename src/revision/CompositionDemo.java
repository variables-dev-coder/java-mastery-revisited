package revision;

class Engine {
    void start() {
        System.out.println("Engine started");
    }
}

class Car2 {
    private Engine engine = new Engine();  // HAS-A

    void drive() {
        engine.start();
        System.out.println("Car driving");
    }
}

public class CompositionDemo {
    public static void main(String[] args) {
        Car2 car = new Car2();
        car.drive();
    }
}

