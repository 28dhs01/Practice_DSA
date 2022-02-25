package com.dhruv.oops.properties.abstraction.interfaces.primeEg;

public class Car implements Engine,Brakes,MusicPlayer{
    @Override
    public void applyBrake() {
        System.out.println("brakes are applied");
    }

    @Override
    public void start() {
        System.out.println("I start like a normal car");
    }

    @Override
    public void stop() {
        System.out.println("I stop like a normal car");
    }
}
