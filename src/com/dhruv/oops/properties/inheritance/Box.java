package com.dhruv.oops.properties.inheritance;

public class Box {
    int h ;
    int w ;
    int l ;

    public Box() {
        this.h = -1;
        this.w = -1 ;
        this.l = -1 ;
    }

    // lets make a cube
    public Box(int side){
        this.h = side ;
        this.w = side ;
        this.l = side ;
    }

    public Box(int h, int w, int l) {
        this.h = h;
        this.w = w;
        this.l = l;
    }
    public Box(Box other){
        this.h = other.h;
        this.w = other.w ;
        this.l = other.l ;
    }
}
