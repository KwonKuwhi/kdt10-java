package _05_class._07_interface.practice;

public class CdPlayer implements Music {
    String album ;
    String singer;
    public CdPlayer(String album,String singer){
        this.album = album;
        this.singer = singer;
    }
    @Override
    public void play(){
        System.out.printf("MP3 player에서 '%s %s' 앨범을 재생합니다 \n", singer, album );
    }

    @Override
    public void stop(){
        System.out.printf("MP3 player에서 '%s %s' 앨범을 정지합니다 \n", singer, album );
    }
}
