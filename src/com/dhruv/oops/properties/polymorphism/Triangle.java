package com.dhruv.oops.properties.polymorphism;

public class Triangle extends Shapes{
    @Override
    void area(){
        System.out.println("Area of triangle is 0.5*base*height");
    }
}
