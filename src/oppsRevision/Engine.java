package oppsRevision;

interface Engine {
    void start();
}

interface Music {
    void play();
}

class Car2 implements Engine, Music {

    public void start() {
        System.out.println("Engine starts");
    }

    public void play() {
        System.out.println("Music plays");
    }

    public static void main(String[] args) {
        Car2 c = new Car2();
        c.start();
        c.play();
    }
}
