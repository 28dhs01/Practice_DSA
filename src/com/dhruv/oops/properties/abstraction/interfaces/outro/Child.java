package com.dhruv.oops.properties.abstraction.interfaces.outro;

public class Child implements Mother,Father{

    @Override
    public void career(String career) {
        System.out.println("I want to be a "+career);
    }

    @Override
    public void choosePartner(String name) {
        System.out.println("I want to marry "+name);

    }

    @Override
    public void greeting() {
        System.out.println("Hello");
    }
}
