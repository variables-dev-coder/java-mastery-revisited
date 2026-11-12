package SOLID_Principles_Intro_level;

// Interface Segregation Principle (ISP)

// Example 3: Media Player

interface Playable {
    void play();
}

interface Pausable {
    void pause();
}

interface Recordable {
    void record();
}

class AudioPlayer implements Playable, Pausable {

    @Override
    public void play() {
        System.out.println("Playing audio");
    }

    @Override
    public void pause() {
        System.out.println("Audio paused");
    }
}

class VideoRecorder implements Playable, Pausable, Recordable {

    @Override
    public void play() {
        System.out.println("Playing video");
    }

    @Override
    public void pause() {
        System.out.println("Video paused");
    }

    @Override
    public void record() {
        System.out.println("Recording video");
    }
}

public class Main_13 {

    public static void main(String[] args) {

        AudioPlayer audio = new AudioPlayer();

        audio.play();
        audio.pause();

        VideoRecorder video = new VideoRecorder();

        video.play();
        video.pause();
        video.record();
    }
}
