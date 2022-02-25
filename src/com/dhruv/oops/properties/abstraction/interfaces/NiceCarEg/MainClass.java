package com.dhruv.oops.properties.abstraction.interfaces.NiceCarEg;

public class MainClass {
    public static void main(String[] args) {
        NiceCar audi = new NiceCar();
        audi.startCar();
        audi.startMusic();
        audi.updateEngine();
        audi.startCar();
    }
}
