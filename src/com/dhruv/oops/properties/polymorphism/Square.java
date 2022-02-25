package com.dhruv.oops.properties.polymorphism;

public class Square extends Shapes{
//    we use override keyword when parent class and child class both have same property associated with them
//    and we want to use it as defined in the child class
    @Override
    void area(){
        System.out.println("Area of square is side*side");
    }
}
