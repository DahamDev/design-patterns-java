package org.example.adaptor;

public class Mp4Player implements Player{
    @Override
    public void playMp4(String file) {
        System.out.println("playing "+file);
    }

    @Override
    public void playWav(String file) {
        System.out.println("playing "+file);
    }
}
