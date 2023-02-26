package org.example.adaptor;

public class WavPlayer implements Player{
    @Override
    public void playMp4(String file) {
        System.out.println("cant play this file");
    }

    @Override
    public void playWav(String file) {
        System.out.println("playing "+file);

    }
}
