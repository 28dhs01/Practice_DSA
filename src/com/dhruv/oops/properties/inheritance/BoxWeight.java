package com.dhruv.oops.properties.inheritance;

public class BoxWeight extends Box{
    int weight ;

    public BoxWeight(BoxWeight other){
        // in the below line obj is created of BoxWeight but the reference variable is of type Box
        super(other);
        this.weight = other.weight ;
    }

    public BoxWeight(int weight) {
        this.weight = weight;
    }

    public BoxWeight(int h, int w, int l, int weight) {
        super(h, w, l); // super is used to call parent constructor
        this.weight = weight;
//        super(h, w, l); // super can't be used after initiating instance variables of child class
        // children care about parent first then take care of itself

    }

    public BoxWeight() {
        this.weight = -1 ;
    }
}
