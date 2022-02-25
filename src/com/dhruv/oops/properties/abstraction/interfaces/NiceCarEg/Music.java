package com.dhruv.oops.properties.abstraction.interfaces.NiceCarEg;

public class Music implements MusicPlayer{
    @Override
    public void start() {
        System.out.println("music started");
    }

    @Override
    public void stop() {
        System.out.println("music stopped");
    }
}
