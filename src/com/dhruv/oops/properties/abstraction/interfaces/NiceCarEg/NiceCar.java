package com.dhruv.oops.properties.abstraction.interfaces.NiceCarEg;

public class NiceCar {
//    this is data hiding
    private Engine engine ;
    private MusicPlayer music  ;

    public NiceCar() {
        this.engine = new PowerEngine();
        this.music = new Music();
    }
    void startCar(){
        engine.start();
    }
    void stopCar(){
        engine.stop();
    }
    void startMusic(){
        music.start();
    }
    void stopMusic(){
        music.stop();
    }
    void updateEngine(){
        this.engine = new ElectricEngine();
    }


}
