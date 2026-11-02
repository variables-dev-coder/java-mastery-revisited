package abstract_revision;

interface Vehicle8 {

    void start();

    default void stop() {

        System.out.println("Vehicle stopped");
    }
}

class Car8 implements Vehicle8 {

    @Override
    public void start() {

        System.out.println("Car started");
    }
}

public class Main_8 {

    public static void main(String[] args) {

        Car8 car = new Car8();

        car.start();
        car.stop();
    }
}
