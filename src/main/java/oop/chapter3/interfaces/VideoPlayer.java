package oop.chapter3.interfaces;

public class VideoPlayer implements Playable {

    @Override
    public void play() {
        System.out.println("Video is playing");
    }

}
