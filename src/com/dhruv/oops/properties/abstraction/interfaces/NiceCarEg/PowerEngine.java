package com.dhruv.oops.properties.abstraction.interfaces.NiceCarEg;

public class PowerEngine implements Engine{
    @Override
    public void start() {
        System.out.println("I start like a normal car");
    }

    @Override
    public void stop() {
        System.out.println("I stop like a normal car");
    }
}
