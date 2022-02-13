package com.dhruv.oops.properties.inheritance;

public class BoxMain {
    public static void main(String[] args) {
//        Box box1 = new Box();
//        System.out.println(box1.w+ " " +box1.h +" "+ box1.l);
//        Box box2 = new Box(4);
//        System.out.println(box2.w+ " " +box2.h +" "+ box2.l);
//        Box box3 = new Box(5,10,12);
//        System.out.println(box3.w+ " " +box3.h +" "+ box3.l);
//
//        BoxWeight box4 = new BoxWeight(4,3,5,10);
//        System.out.println(box4.w+ " " +box4.h +" "+ box4.l +" " +box4.weight);
//

        // Below reference variable is of parent class and object created is of child class
        // so the doubt I am facing is that whose variables I can use
        // I can use variables of reference type only
        Box box5 = new BoxWeight(10,7,13,20);
//        System.out.println(box5.weight); I can't use this
        System.out.println(box5.h);

        // box6 can use variables of BoxWeight class
        // that is h, w, l and weight
        // but the constructor is of type Box which has no idea about the weight property
        // hence error
//        BoxWeight box6 = new Box(7,10,12);



    }
}
