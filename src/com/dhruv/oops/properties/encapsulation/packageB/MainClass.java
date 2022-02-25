package com.dhruv.oops.properties.encapsulation.packageB;

import com.dhruv.oops.properties.encapsulation.packageA.Shapes;

public class MainClass {
    public static void main(String[] args) {
//        Shapes shape = new Shapes();
//        System.out.println(shape.shapeName);
        Hexagon hexagon = new Hexagon() ;
        System.out.println(hexagon.shapeName);

//        below code won't work for protected variable
//        had it worked, there would be no difference between public and protected keyword
//        System.out.println(hexagon.num);


    }
}
