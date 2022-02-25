package com.dhruv.oops.properties.abstraction.interfaces.primeEg;

public class MainClass {
    public static void main(String[] args) {
//        I can't make the objects of interfaces
//        why?
//        interfaces by default store abstract methods and abstract methods come inside abstract classes
//        hence if I make the obj and then call the method in it, it will be confused how to run a method without body
//        hence throws compile time error
//        Engine engine = new Engine()

//        Car nexon = new Car() ;
//        nexon.applyBrake();
//        nexon.start();
//        nexon.stop();

//        now below i want music player class to be executed but instead it is starting or stopping the car
//        to solve this issue i have to separately make classes for interfaces
        MusicPlayer i10 = new Car() ;
        i10.start();
        i10.stop();
    }
}
