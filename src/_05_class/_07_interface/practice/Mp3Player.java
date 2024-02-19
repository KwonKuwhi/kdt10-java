package _05_class._07_interface.practice;

public class Mp3Player implements Music{

    String song ;
    String singer;
    public Mp3Player(String song,String singer){
        this.song = song;
        this.singer = singer;
    }
    @Override
    public void play(){
        System.out.printf("CD player에서 '%s %s' 음악을 재생합니다 \n", singer, song );
    }

    @Override
    public void stop(){
        System.out.printf("CD player에서 '%s %s' 음악을 정지합니다 \n", singer, song );
    }
}
