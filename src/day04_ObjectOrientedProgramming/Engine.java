package day04_ObjectOrientedProgramming;

public class Engine {
    Engine() {
        System.out.println("Engine created");
    }
}

class Car {
    private Engine engine = new Engine();

    public static void main(String[] args) {
        Car car = new Car();  // Engine created
    }
}