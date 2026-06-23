package oppsRevision2;

class Engine10 {

    void start() {
        System.out.println("Engine Started");
    }
}

class Car10 {

    private Engine10 engine10 =
            new Engine10();

    void startCar10() {
        engine10.start();
    }
}

public class Main10 {

    public static void main(String[] args) {

        Car10 car = new Car10();

        car.startCar10();
    }
}
