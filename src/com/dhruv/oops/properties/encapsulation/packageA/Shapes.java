package com.dhruv.oops.properties.encapsulation.packageA;

import com.dhruv.oops.properties.polymorphism.Triangle;

public class Shapes {
//    private properties can be used inside the same class only
//    use getters and setters to use them outside the class
    private int sides = 3 ;
//    public variables can be accessed outside other packages too, no matter they are inherited or not
    public String shapeName = "triangle" ;

//    protected can be called from child classes even from outside the packages too
//    but mind it can be called only from inside the child packages otherwise there would be no difference between public and protected
    protected int num = 218 ;
    public int getSides() {
        return sides;
    }

    public void setSides(int sides) {
        this.sides = sides;
    }

    void area(){
        System.out.println("calculates area for shape class");
    }
//    default methods - they can be called from child classes within the same package but not from the child classes of outside packages
    void greet(){
        System.out.println("hello I am greet() from shape class");
    }
}
