package oop.chapter03.interfaces;

public class Main {

    static void main() {

        Playable musicPlayer = new MusicPlayer();
        Playable videoPlayer = new VideoPlayer();

        MediaController mediaController = new MediaController();

        mediaController.playMedia(musicPlayer);
        mediaController.playMedia(videoPlayer);

    }

}
