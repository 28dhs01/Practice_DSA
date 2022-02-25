package com.dhruv.oops.properties.abstraction.abstractClasses;

public class MainClass {
    public static void main(String[] args) {
        /* objects of abstract classes can't be formed
        why?
        because if I try to run parent.career() it will throw compile time error as career() has no body
        */
//        Parent parent = new Parent() ;

        Son dhruv = new Son() ;
        dhruv.career("coder");
        Daughter sonia = new Daughter();
        sonia.career("Teacher");

//        the below code will also be executed because what I can access depends on reference variable
//        but whose method will actually runs depends on run time polymorphism aka depends on type of object which is made
        Parent someone = new Son() ;
        someone.career("doctor");

//        this code will run because greet() is a static method which is independent of objects
        Parent.greet();

//       We learnt a lot about abstract classes but still right now we can't do multiple inheritance with all that
//        to do so use interfaces
    }
}
