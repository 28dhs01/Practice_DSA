package com.dhruv.oops.properties.inheritance;

public class BoxPrice extends BoxWeight{
    int cost ;
    BoxPrice(){
        super() ;
        this.cost = -1 ;
    }
    BoxPrice(int side,int weight, int cost){
        super(side,weight) ;
        this.cost = cost ;
    }
}
