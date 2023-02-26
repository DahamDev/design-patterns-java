package org.example.adaptor;

public class MediaPlayerAdaptor implements MediaPlayer{

    Player player;

    public MediaPlayerAdaptor(String format){
        if(format.equalsIgnoreCase("mp4")){
            player= new Mp4Player();
        } else if (format.equals("wav")) {
            player = new WavPlayer();
         }
    }

    @Override
    public void play(String name, String type) {
        if(type.equals("mp4"))player.playMp4(name);
        if(type.equals("wav"))player.playWav(name);
    }
}
