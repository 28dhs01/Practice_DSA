package com.dhruv.oops.properties.inheritance;

public class BoxColor extends BoxWeight{
    String color ;
    BoxColor(){
        super() ;
        this.color = "blue" ;
    }

    public BoxColor(int h, int w, int l, int weight, String color) {
        super(h, w, l, weight);
        this.color = color;
    }
    BoxColor( int side, int weight , String color ){
        super ( side, weight ) ;
        this.color = color ;
    }

}
