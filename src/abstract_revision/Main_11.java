package abstract_revision;

// Multiple Inheritance Using Interfaces

interface Camera {

    void takePhoto();
}

interface MusicPlayer {

    void playMusic();
}

class Smartphone implements Camera, MusicPlayer {

    @Override
    public void takePhoto() {

        System.out.println("Taking photo");
    }

    @Override
    public void playMusic() {

        System.out.println("Playing music");
    }
}

public class Main_11 {

    public static void main(String[] args) {

        Smartphone phone = new Smartphone();

        phone.takePhoto();
        phone.playMusic();
    }
}
