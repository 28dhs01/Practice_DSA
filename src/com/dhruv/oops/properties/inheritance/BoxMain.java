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
//        Box box5 = new BoxWeight(10,7,13,20);
////        System.out.println(box5.weight); I can't use this
//        System.out.println(box5.h);

        // box6 can use variables of BoxWeight class
        // that is h, w, l and weight
        // but the constructor is of type Box which has no idea about the weight property
        // hence error
//        BoxWeight box6 = new Box(7,10,12);

//        BoxPrice box7 = new BoxPrice(7,10,1000);
//        System.out.println(box7.h);
//        System.out.println(box7.cost);
//
////        box7 and box8 are perfect eg. of hierarchical inheritance
////        both have same parent as BoxWeight class
//        BoxColor box8 = new BoxColor(10,20,"red") ;
//        System.out.println(box8.color);

//      here I am looking for static methods can be overridden or not
//        static methods are object independent
//        overriding is object dependent
//        hence static methods can't be overridden
        Box box9 = new BoxWeight();
//        first of all greeting is static method so what i have written below should be avoided
//        making obj is not required
//        can be directly called from class itself
        box9.greeting();
//        now above one is showing greeting msg of box class not boxWeight class
//        why?
//        static methods are independent of obj 

    }
}
