package oop.chapter3.interfaces;

public class Main {

    static void main() {

        Playable player1 = new MusicPlayer();
        Playable player2 = new VideoPlayer();

        MediaController mediaController = new MediaController();

        mediaController.playMedia(player1);
        mediaController.playMedia(player2);

    }

}
