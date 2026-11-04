package abstract_revision;

interface Engine {

    void startEngine();

    default void stopEngine() {
        System.out.println("Engine stopped");
    }
}

interface MusicSystem {

    void playMusic();

    default void stopMusic() {
        System.out.println("Music stopped");
    }
}

class Car17 implements Engine, MusicSystem {

    @Override
    public void startEngine() {
        System.out.println("Car engine started");
    }

    @Override
    public void playMusic() {
        System.out.println("Car music playing");
    }
}

public class Main_17 {

    public static void main(String[] args) {

        Car17 car = new Car17();

        car.startEngine();
        car.playMusic();

        car.stopMusic();
        car.stopEngine();
    }
}
