package oop.chapter03.interfaces;

public class MusicPlayer implements Playable {

    @Override
    public void play() {
        System.out.println("Music is playing");
    }

}
