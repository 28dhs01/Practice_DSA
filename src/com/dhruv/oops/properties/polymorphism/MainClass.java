package com.dhruv.oops.properties.polymorphism;

public class MainClass {
    public static void main(String[] args) {
//        polymorphism means many forms
//        two types: 1. compile time polymorphism / static polymorphism - overloading
//                   2. run time polymorphism / dynamic polymorphism - overriding
        Shapes shape = new Shapes() ;
        Triangle triangle = new Triangle();
//        I know that I can access the members of reference variable type
//        as area() is there in Shapes class, I can access it
//        but when I am running it is showing area of square
//        why?
//        this is run time polymorphism
//        whether method could be used or not depends on reference variable i.e. Shapes here
//        but how to use it depends on class whose object finally it is made i.e. on Square class
        Shapes square = new Square();
//        hence overriding is dependent on objects
        square.area();



//        final keyword
//        we use final keyword if we don't want overriding or when we don't want inheritance

    }
}
