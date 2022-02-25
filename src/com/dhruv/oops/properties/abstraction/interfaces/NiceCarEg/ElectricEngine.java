package com.dhruv.oops.properties.abstraction.interfaces.NiceCarEg;

public class ElectricEngine implements Engine{
    @Override
    public void start() {
        System.out.println("I start like an electric car");
    }

    @Override
    public void stop() {
        System.out.println("I stop like an electric car");
    }
}
