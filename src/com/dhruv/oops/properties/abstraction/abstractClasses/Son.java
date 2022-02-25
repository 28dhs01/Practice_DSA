package com.dhruv.oops.properties.abstraction.abstractClasses;

public class Son extends Parent {
    public Son(){
        super();
    }
    //   abstract methods must be overridden in child classes
    @Override
    void career(String career) {
        System.out.println("I am in son class. I am going to be a "+career);
    }
}
