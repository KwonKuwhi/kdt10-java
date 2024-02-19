package _05_class._07_interface.practice;

public class MusicPlayer {

    public static void main(String[] args) {
        Music music;


        System.out.println("======MP3 Player======");
        music = new Mp3Player("블루밍", "아이유");
        music.play();
        music.stop();


        System.out.println("======CD Player======");
        music = new CdPlayer("꽃갈피", "아이유");
        music.play();
        music.stop();


    }

}
