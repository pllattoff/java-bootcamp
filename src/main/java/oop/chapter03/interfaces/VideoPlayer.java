package oop.chapter03.interfaces;

public class VideoPlayer implements Playable {

    @Override
    public void play() {
        System.out.println("Video is playing");
    }

}
